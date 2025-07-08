package com.example.barber.controller.appointment;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/appointment")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class AppointmentController {
}
