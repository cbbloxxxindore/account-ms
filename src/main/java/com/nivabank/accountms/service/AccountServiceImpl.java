package com.nivabank.accountms.service;
import com.nivabank.accountms.entity.Account;
import com.nivabank.accountms.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class AccountServiceImpl implements  AccountService {
        private final AccountRepository accountRepository;

        @Autowired
        public AccountServiceImpl(AccountRepository accountRepository) {
            this.accountRepository = accountRepository;
        }

        public List<Account> getAllAccounts() {
            return accountRepository.findAll();
        }

        public Optional<Account> getAccountById(String id) {
            return accountRepository.findById(id);
        }

        public Account createAccount(Account account) {
            return accountRepository.save(account);
        }

        public Account updateAccount(String id, Account account) {
            if (accountRepository.existsById(id)) {
                account.setId(id);
                return accountRepository.save(account);
            }
            return null;
        }

        public void deleteAccount(String id) {
            accountRepository.deleteById(id);
        }
    }


