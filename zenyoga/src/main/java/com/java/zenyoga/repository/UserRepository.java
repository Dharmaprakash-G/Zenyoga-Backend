package com.java.zenyoga.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.zenyoga.model.User;



public interface UserRepository extends JpaRepository<User, String>{
    Optional<User> findByEmail(String email);
}
