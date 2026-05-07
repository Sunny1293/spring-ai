package com.example.spring_ai_demo.dto;

import com.example.spring_ai_demo.entity.BookingStatus;
import java.time.Instant;

public record BookingResponse(Long id,
                              String destination,
                              Instant departureTime,
                              BookingStatus status) {}