package com.crispy.giggle.microservices.service;

import com.crispy.giggle.microservices.model.CustomerRequest;
import com.crispy.giggle.microservices.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    public String createCustomer(CustomerRequest customerRequest) {
        var customer= customerRepository.save(customerMapper.toCustomer(customerRequest));
        return customer.getId();
    }

    public void updateCustomer( CustomerRequest request) {
    }
}
