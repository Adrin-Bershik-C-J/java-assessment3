package com.example.assessment3.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.assessment3.dto.RegistrationRequestDTO;
import com.example.assessment3.dto.RegistrationResponseDTO;
import com.example.assessment3.entity.Registration;

@Mapper(componentModel = "spring")
public interface RegistrationMapper {

    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "event.id", target = "eventId")
    RegistrationResponseDTO toDto(Registration register);

    @Mapping(target = "date", ignore = true)
    @Mapping(target = "registrationId", ignore = true)
    @Mapping(source = "userId", target = "user.id")
    @Mapping(source = "eventId", target = "event.id")
    Registration toEntity(RegistrationRequestDTO register);

    List<RegistrationResponseDTO> toDtoList(List<Registration> registrations);

}
