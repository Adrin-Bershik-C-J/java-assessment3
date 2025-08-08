package com.example.assessment3.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.assessment3.dto.UserRequestDTO;
import com.example.assessment3.dto.UserResponseDTO;
import com.example.assessment3.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponseDTO toDto(User user);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "registrations", ignore = true)
    User toEntity(UserRequestDTO user);

}
