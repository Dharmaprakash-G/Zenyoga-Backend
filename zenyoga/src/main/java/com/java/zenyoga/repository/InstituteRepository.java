package com.java.zenyoga.repository;

import com.java.zenyoga.model.Institute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstituteRepository extends JpaRepository<Institute, String> {
    // You can add custom query methods here if needed
}
