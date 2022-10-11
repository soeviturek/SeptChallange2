package com.example.challange.service;

import com.example.challange.model.Account;
import com.example.challange.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AccountServiceImpl implements AccountService{
    @Autowired
    AccountRepository accountRepository;
    @Override
    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account updateAccount(Account account) {
        Optional<Account> check = accountRepository.findById(account.getAccountNumber());
        Account update = null;
        if(check.isPresent()){
            update = check.get();
            update.setAccountName(account.getAccountName());
            update.setAccountType(account.getAccountType());
            update.setBalance(account.getBalance());
            update.setDate(account.getDate());
        }
        return update;
    }

    @Override
    public Account getAccountByAccountNumber(String accountNumber) {
        Optional<Account> account = accountRepository.findById(accountNumber);
        if(account.isPresent()){
            return account.get();
        }
        return null;
    }

    @Override
    public List<Account> getAllAccounts() {
        List<Account> list = accountRepository.findAll();
        return list;
    }

    @Override
    public List<Account> getPersonAccounts(int id) {
        List<Account> list = accountRepository.findPersonAccounts(id);
        return list;
    }

    @Override
    public boolean deleteAccountByNumber(String accountNumber) {
        accountRepository.deleteById(accountNumber);
        return true;
    }
}
