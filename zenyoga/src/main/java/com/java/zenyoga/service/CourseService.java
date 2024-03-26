package com.java.zenyoga.service;

import com.java.zenyoga.model.Course;
import com.java.zenyoga.repository.CourseRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@SuppressWarnings("null")
public class CourseService {

    
    private final CourseRepository courseRepository;

    

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public Optional<Course> getCourseById(String courseId) {
        return courseRepository.findById(courseId);
    }

    public Optional<Course> updateCourse(String courseId, Course newCourse) {
        return courseRepository.findById(courseId)
                .map(existingCourse -> {
                    existingCourse.setCourseName(newCourse.getCourseName());
                    existingCourse.setCourseDescription(newCourse.getCourseDescription());
                    existingCourse.setCourseDuration(newCourse.getCourseDuration());
                    return courseRepository.save(existingCourse);
                });
    }

    public boolean deleteCourse(String courseId) {
        Optional<Course> courseOptional = courseRepository.findById(courseId);
        if (courseOptional.isPresent()) {
            courseRepository.deleteById(courseId);
            return true;
        }
        return false;
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}

