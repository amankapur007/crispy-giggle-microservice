package com.crispy.giggle.microservices.model;

import lombok.*;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class Address {
    private String street;
    private String houseNumber;
    private String zipCode;

}
