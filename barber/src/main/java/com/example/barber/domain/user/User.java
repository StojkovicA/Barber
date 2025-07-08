package com.example.barber.domain.user;

import com.example.barber.common.enums.Role;
import com.example.barber.domain.appointment.Appointment;
import com.example.barber.domain.shop.Shop;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL", unique = true)
    private String email;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "PASSWORD")
    private String password;


    @Column(name = "ROLE")
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Shop> shop;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Appointment> appointments;
}

