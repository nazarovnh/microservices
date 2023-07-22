package org.microservices.customer.web.controller.customer;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.microservices.customer.core.service.CustomerService;
import org.microservices.customer.web.model.customer.CustomerRegistrationRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("api/v1/customer")
@RestController
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest){
        log.info("New customer registration {}", customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);
    }

}
