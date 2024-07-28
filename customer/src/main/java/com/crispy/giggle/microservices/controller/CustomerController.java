package com.crispy.giggle.microservices.controller;

import com.crispy.giggle.microservices.model.CustomerRequest;
import com.crispy.giggle.microservices.service.CustomerService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("/api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<String> createCustomer(@Valid  @RequestBody CustomerRequest customerRequest){
        return ResponseEntity.ok(customerService.createCustomer(customerRequest));
    }

    public ResponseEntity<Void> updateCustomer(@Valid @RequestBody  CustomerRequest customerRequest){
        customerService.updateCustomer(customerRequest);
        return ResponseEntity.accepted().build();
    }
}
