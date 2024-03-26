package com.java.zenyoga.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
@AllArgsConstructor
@Entity
@Table(name="dp_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String studentId;

    
    private String studentName;    
    private String studentDOB;  
    private String address;
    private String mobile;
    private String age;
    
}
