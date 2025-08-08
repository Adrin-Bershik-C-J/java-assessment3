package com.example.assessment3.dto;

import lombok.Data;

@Data
public class EventResponseDTO {

    private Long id;
    private String title;
    private String description;
    private String date;
    private String location;

}
