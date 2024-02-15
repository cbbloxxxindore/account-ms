package com.nivabank.accountms.service;

import com.nivabank.accountms.entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    List<Account> getAllAccounts();

    Optional<Account> getAccountById(String id);

    Account createAccount(Account account);

    Account updateAccount(String id, Account account);

    void deleteAccount(String id);
}
