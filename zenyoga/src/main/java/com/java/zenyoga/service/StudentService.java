package com.java.zenyoga.service;

import com.java.zenyoga.model.Student;
import com.java.zenyoga.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@SuppressWarnings("null")
public class StudentService {

    private final StudentRepository studentRepository;

    

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> getStudentById(String studentId) {
        return studentRepository.findById(studentId);
    }

    public Optional<Student> updateStudent(String studentId, Student newStudent) {
        return studentRepository.findById(studentId)
                .map(existingStudent -> {
                    existingStudent.setStudentName(newStudent.getStudentName());
                    existingStudent.setStudentDOB(newStudent.getStudentDOB());
                    existingStudent.setAddress(newStudent.getAddress());
                    existingStudent.setMobile(newStudent.getMobile());
                    existingStudent.setAge(newStudent.getAge());
                    return studentRepository.save(existingStudent);
                });
    }

    public boolean deleteStudent(String studentId) {
        Optional<Student> studentOptional = studentRepository.findById(studentId);
        if (studentOptional.isPresent()) {
            studentRepository.deleteById(studentId);
            return true;
        }
        return false;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
