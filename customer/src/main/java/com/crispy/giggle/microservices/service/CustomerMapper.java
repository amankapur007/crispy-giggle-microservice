package com.crispy.giggle.microservices.service;

import com.crispy.giggle.microservices.model.Customer;
import com.crispy.giggle.microservices.model.CustomerRequest;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {

    public Customer toCustomer(CustomerRequest customerRequest){
        if(customerRequest == null){
            return null;
        }
        return Customer.builder()
                .id(customerRequest.id())
                .firstName(customerRequest.firstName())
                .lastName(customerRequest.lastName())
                .email(customerRequest.email())
                .address(customerRequest.address()).build();
    }
}
