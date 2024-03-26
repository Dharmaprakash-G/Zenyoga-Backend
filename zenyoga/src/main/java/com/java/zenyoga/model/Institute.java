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
@Table(name="dp_institute")
public class Institute {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String instituteId;

    private String instituteName;

    private String instituteDescription;

    private String instituteAddress;

    private String mobile;

    private String email;
    
}
