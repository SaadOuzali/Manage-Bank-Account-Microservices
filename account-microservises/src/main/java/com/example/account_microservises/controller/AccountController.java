package com.example.account_microservises.controller;


import com.example.account_microservises.clients.CustomerRestClient;
import com.example.account_microservises.entitie.BankAccount;
import com.example.account_microservises.model.Customer;
import com.example.account_microservises.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

 private final AccountService accountService;

 private final CustomerRestClient customerRestClient;

 @PostMapping("/create")
    public String createAccount(@RequestBody BankAccount bankAccount){
    return this.accountService.createAccount(bankAccount);
 }

 @GetMapping("/all")
    public List<BankAccount> findAllAccount(){
     return this.accountService.findAllAccount();
 }

 @GetMapping("/test")
public String test(){
     return "kolchi nadi aba saad";
 }

    @GetMapping("/{Id}")
    public BankAccount findOneAccount(@PathVariable Long Id){
        System.out.println(Id);
        BankAccount bankAccount= this.accountService.findAccountById(Id);
        Customer customer=this.customerRestClient.findCustomerById(bankAccount.getCustomerId());
        bankAccount.setCustomer(customer);
        return bankAccount;
    }
}
