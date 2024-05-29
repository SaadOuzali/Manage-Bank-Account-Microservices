package com.example.customer_microservises.controller;

import com.example.customer_microservises.entitie.Customer;
import com.example.customer_microservises.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/create")
    public String createCustomer(@RequestBody Customer customer){
       String msg= this.customerService.createCustomer(customer);
        return msg;
    }

    @GetMapping("/all")
    public List<Customer> findAllCustomer(){
        return this.customerService.findAllCust();
    }


    @GetMapping("/{Id}")
    public Customer findOneCustomer(@PathVariable Long Id){
        return this.customerService.findCustomerById(Id);
    }
}
