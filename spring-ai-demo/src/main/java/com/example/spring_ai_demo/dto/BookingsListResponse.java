package com.example.spring_ai_demo.dto;

import java.util.List;

public record BookingsListResponse(List<BookingResponse> bookings, String message) {}
