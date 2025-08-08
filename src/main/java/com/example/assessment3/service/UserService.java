package com.example.assessment3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assessment3.dto.UserRequestDTO;
import com.example.assessment3.dto.UserResponseDTO;
import com.example.assessment3.entity.User;
import com.example.assessment3.mapper.UserMapper;
import com.example.assessment3.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public UserResponseDTO createUser(UserRequestDTO user) {
        User temp = userMapper.toEntity(user);
        User savedUser = userRepository.save(temp);
        return userMapper.toDto(savedUser);
    }

}
