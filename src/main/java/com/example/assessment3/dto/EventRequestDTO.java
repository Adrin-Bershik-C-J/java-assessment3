package com.example.assessment3.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class EventRequestDTO {

    @NotNull(message = "Event title should not be blank")
    @Size(max = 20, message = "Title length should not exceed 20 characters")
    private String title;

    @Size(max = 100, message = "Description should not exceed 100 characters")
    private String description;

    @NotNull(message = "Date should not be left blank")
    @Size(max = 10, message = "Date should be of max 10 characters")
    private String date;

    @NotNull(message = "Location is mandatory to mention")
    @Size(max = 30, message = "Location should not exceed length of 30")
    private String location;
}
