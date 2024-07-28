package com.crispy.giggle.microservices.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
        String id,
        @NotNull(message = "Customer first name can not be null")
        String firstName,
        @NotNull(message = "Customer last name can not be null")
        String lastName,
        @NotNull(message = "Customer email can not be null")
        @Email(message = "Enter the valid email")
        String email,
        Address address
) {
}
