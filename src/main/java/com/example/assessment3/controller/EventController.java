package com.example.assessment3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assessment3.dto.EventRequestDTO;
import com.example.assessment3.dto.EventResponseDTO;
import com.example.assessment3.service.EventService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public ResponseEntity<EventResponseDTO> createEvent(@Valid @RequestBody EventRequestDTO event) {
        EventResponseDTO savedEvent = eventService.createEvent(event);
        return ResponseEntity.ok(savedEvent);
    }
}
