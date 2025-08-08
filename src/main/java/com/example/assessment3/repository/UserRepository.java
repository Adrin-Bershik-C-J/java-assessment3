package com.example.assessment3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.assessment3.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
