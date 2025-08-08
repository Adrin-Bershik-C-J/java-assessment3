package com.example.assessment3.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assessment3.dto.RegistrationRequestDTO;
import com.example.assessment3.dto.RegistrationResponseDTO;
import com.example.assessment3.entity.Registration;
import com.example.assessment3.exception.ResourceNotFoundException;
import com.example.assessment3.mapper.RegistrationMapper;
import com.example.assessment3.repository.EventRepository;
import com.example.assessment3.repository.RegistrationRepository;
import com.example.assessment3.repository.UserRepository;

@Service
public class RegisterService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Autowired
    private RegistrationMapper registrationMapper;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EventRepository eventRepository;

    public RegistrationResponseDTO createRegistration(RegistrationRequestDTO register) {
        Registration registration = new Registration();
        registration.setUser(userRepository.findById(register.getUserId())
                .orElseThrow(() -> new ResourceNotFoundException("User not found")));
        registration.setEvent(eventRepository.findById(register.getEventId())
                .orElseThrow(() -> new ResourceNotFoundException("Event not found")));
        Registration saved = registrationRepository.save(registration);
        return registrationMapper.toDto(saved);
    }

    public List<RegistrationResponseDTO> findRegistrationsByEventId(Long eventId) {
        return registrationRepository.findByEventId(eventId)
                .stream()
                .map(registrationMapper::toDto)
                .collect(Collectors.toList());
    }

}
