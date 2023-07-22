package org.microservices.customer.config;

import org.microservices.customer.core.repository.CustomerRepository;
import org.microservices.customer.core.service.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public CustomerService customerService(CustomerRepository customerRepository) {
        return new CustomerService(customerRepository);
    }
}
