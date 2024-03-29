package com.nivabank.accountms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "account")
public class Account {
    @Id
    private String id;
    private String accountNumber;
    private double balance;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate createdDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate modifiedDate;
    private String iban;
    private String currency;
    //@Enumerated(EnumType.STRING)
    private AccountType accountType;
    //--------------

    private String accountHolderName;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "customer_id",referencedColumnName = "id")
//    private Customer customer;
//
//    @OneToMany(mappedBy = "account",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    private Set<Card> cards;

//    public AccountDto accountDto(){
//        return AccountDto.builder()
//                .id(this.id)
//                .accountNumber(this.accountNumber)
//                .balance(this.balance)
//                .createdDate(this.createdDate)
//                .modifiedDate(this.modifiedDate)
//                .iban(this.iban)
//                .currency(this.currency)
//                .accountType(this.accountType)
//                .build();
    }
