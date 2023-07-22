package org.microservices.customer.core.service;

import lombok.AllArgsConstructor;
import org.microservices.customer.core.entity.Customer;
import org.microservices.customer.core.repository.CustomerRepository;
import org.microservices.customer.web.model.customer.CustomerRegistrationRequest;

@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    public void registerCustomer(CustomerRegistrationRequest request){
        Customer customer = Customer.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .build();
        customerRepository.save(customer);
    }
}
