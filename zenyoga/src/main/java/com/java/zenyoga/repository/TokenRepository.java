package com.java.zenyoga.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.zenyoga.model.Token;



public interface TokenRepository extends JpaRepository<Token, String>{
    List<Token> findAllByUser_IdAndRevokedFalseAndExpiredFalse(String id);

    Optional<Token> findByToken(String token);
}
