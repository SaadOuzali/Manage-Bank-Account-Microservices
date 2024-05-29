package com.example.account_microservises.repository;

import com.example.account_microservises.entitie.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,Long> {
}
