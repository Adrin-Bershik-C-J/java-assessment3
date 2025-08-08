package com.example.assessment3.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class RegistrationResponseDTO {

    private Long registrationId;
    private LocalDate date;
    private Long userId;
    private Long eventId;

}
