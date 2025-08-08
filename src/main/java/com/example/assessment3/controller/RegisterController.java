package com.example.assessment3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assessment3.dto.RegistrationRequestDTO;
import com.example.assessment3.dto.RegistrationResponseDTO;
import com.example.assessment3.service.RegisterService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @PostMapping
    public ResponseEntity<RegistrationResponseDTO> createRegistration(
            @Valid @RequestBody RegistrationRequestDTO register) {
        RegistrationResponseDTO saved = registerService.createRegistration(register);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/event/{eventId}")
    public ResponseEntity<List<RegistrationResponseDTO>> getByEventId(@PathVariable Long eventId) {
        List<RegistrationResponseDTO> registrations = registerService.findRegistrationsByEventId(eventId);
        return ResponseEntity.ok(registrations);
    }

}
