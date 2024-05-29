package com.example.account_microservises.service;


import com.example.account_microservises.entitie.BankAccount;
import com.example.account_microservises.enumclasses.AccountType;
import com.example.account_microservises.repository.BankAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final BankAccountRepository bankAccountRepository;
    public String createAccount(BankAccount bankAccount) {
        bankAccount.setAccountType(AccountType.CURRENT_ACCOUNT);
        this.bankAccountRepository.save(bankAccount);
        return "account created success";
    }

    public List<BankAccount> findAllAccount() {
        return this.bankAccountRepository.findAll();
    }

    public BankAccount findAccountById(Long id) {
        return this.bankAccountRepository.findById(id).orElse(null);
    }
}
