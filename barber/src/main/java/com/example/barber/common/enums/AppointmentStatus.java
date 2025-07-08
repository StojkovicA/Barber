package com.example.barber.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AppointmentStatus {

    PENDING,
    CONFIRMED,
    DECLINED
}
