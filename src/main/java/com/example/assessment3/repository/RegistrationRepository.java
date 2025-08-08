package com.example.assessment3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.assessment3.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    List<Registration> findByEventId(Long eventId);
}
