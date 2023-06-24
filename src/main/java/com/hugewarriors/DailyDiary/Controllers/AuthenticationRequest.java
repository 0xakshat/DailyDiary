package com.hugewarriors.DailyDiary.Controllers;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
@SuperBuilder
public class AuthenticationRequest {
    private String email;
    private String password;
}

