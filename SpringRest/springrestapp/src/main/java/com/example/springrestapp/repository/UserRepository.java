package com.example.springrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springrestapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
