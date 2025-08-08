package com.example.assessment3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.assessment3.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}
