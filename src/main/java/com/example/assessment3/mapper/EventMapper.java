package com.example.assessment3.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.assessment3.dto.EventRequestDTO;
import com.example.assessment3.dto.EventResponseDTO;
import com.example.assessment3.entity.Event;

@Mapper(componentModel = "spring")
public interface EventMapper {

    EventResponseDTO toDto(Event event);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "registrations", ignore = true)
    Event toEntity(EventRequestDTO event);
}
