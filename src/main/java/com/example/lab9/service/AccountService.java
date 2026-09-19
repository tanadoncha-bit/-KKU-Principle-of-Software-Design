package com.example.lab9.service;

import org.springframework.stereotype.Service;
import com.example.lab9.model.Account;
import com.example.lab9.repository.AccountRepository;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public void createAccount(Account account){
        accountRepository.save(account);
    }
    public Account findAccountById(Long id){
        return accountRepository.findById(id).orElse(null);
    }
}
