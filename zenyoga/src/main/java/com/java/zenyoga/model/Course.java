package com.java.zenyoga.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="dp_course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String courseId;    
    private String courseName;    
    private String courseDescription;   
    private String courseDuration;
    
}
