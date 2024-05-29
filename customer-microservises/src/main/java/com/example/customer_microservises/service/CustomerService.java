package com.example.customer_microservises.service;

import com.example.customer_microservises.entitie.Customer;
import com.example.customer_microservises.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String createCustomer(Customer customer){

        this.customerRepo.save(customer);
        return "customer created successfully";
    }

    public List<Customer> findAllCust() {
        return this.customerRepo.findAll();
    }

    public Customer findCustomerById(Long Id) {

        return this.customerRepo.findById(Id).orElse(null);
    }
}
