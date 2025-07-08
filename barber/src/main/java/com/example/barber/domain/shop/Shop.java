package com.example.barber.domain.shop;

import com.example.barber.domain.appointment.Appointment;
import com.example.barber.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SHOP")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "STREET")
    private String street;

    @Column(name = "CITY")
    private String city;

    @Column(name = "CONTACT_EMAIL", unique = true)
    private String contactEmail;

    @Column(name = "CONTACT_PHONE")
    private String contactPhone;

    @Column(name = "DESCRIPTION", length = 500)
    private String description;

    @Column(name = "APPOINTMENT_LENGTH_MINUTES")
    private int appointmentLengthMinutes;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "shop")
    List<Appointment> appointments;
}

