package com.example.account_microservises.clients;

import com.example.account_microservises.model.Customer;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CUSTOMER-MICROSERVISES")

public interface CustomerRestClient {

    @GetMapping("/customer/{id}")
    @CircuitBreaker(name = "customerservice",fallbackMethod = "getDefaultCustomer")
    Customer findCustomerById(@PathVariable  Long id);

    default Customer getDefaultCustomer(Long id,Exception ex){
        Customer customer=new Customer();
        customer.setCustomerId(id);
        customer.setCustomerName("Not Available");
        return customer;
    }
}
