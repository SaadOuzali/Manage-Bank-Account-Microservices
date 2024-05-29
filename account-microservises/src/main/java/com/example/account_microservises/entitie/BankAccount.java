package com.example.account_microservises.entitie;

import com.example.account_microservises.enumclasses.AccountType;
import com.example.account_microservises.model.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "bank_account")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_Id")
    private Long Id;

    private Double balance;

    @CreationTimestamp
     private LocalDateTime createdAt;

    @Enumerated( EnumType.STRING)
    private AccountType accountType;

    @Transient
    private Customer customer;

    private Long customerId;
}
