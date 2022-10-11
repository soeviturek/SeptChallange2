package com.example.challange.service;

import com.example.challange.model.Account;

import java.util.List;

public interface AccountService {

    Account addAccount(Account account);
    Account updateAccount(Account account);
    Account getAccountByAccountNumber(String accountNumber);

    List<Account> getAllAccounts();

    List<Account> getPersonAccounts(int id);

    boolean deleteAccountByNumber(String accountNumber);



}
