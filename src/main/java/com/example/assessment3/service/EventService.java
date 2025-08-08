package com.example.assessment3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assessment3.dto.EventRequestDTO;
import com.example.assessment3.dto.EventResponseDTO;
import com.example.assessment3.entity.Event;
import com.example.assessment3.mapper.EventMapper;
import com.example.assessment3.repository.EventRepository;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventMapper eventMapper;

    public EventResponseDTO createEvent(EventRequestDTO event) {
        Event newEvent = eventMapper.toEntity(event);
        Event savedEvent = eventRepository.save(newEvent);
        return eventMapper.toDto(savedEvent);
    }

}
