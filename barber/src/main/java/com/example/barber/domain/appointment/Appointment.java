package com.example.barber.domain.appointment;

import com.example.barber.common.enums.AppointmentStatus;
import com.example.barber.domain.shop.Shop;
import com.example.barber.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "APPOINTMENT")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
    private Long id;

    private LocalDateTime appointmentTime;

    @Column(length = 500)
    private String message;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus status; // PENDING, CONFIRMED, DECLINED

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;
}

