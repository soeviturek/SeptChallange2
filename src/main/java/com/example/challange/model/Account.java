package com.example.challange.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "account")
public class Account {
    private int id;
    private String accountType; //Term Investment, Loan, Saving
    @Id
    private String accountNumber;
    private String accountName;
    private String Balance;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss")
    private Date date;

    public Account() {
    }

    public Account(int id, String accountType, String accountNumber, String accountName, String balance, Date date) {
        this.id = id;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        Balance = balance;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getBalance() {
        return Balance;
    }

    public Date getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(String balance) {
        Balance = balance;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountType='" + accountType + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountName='" + accountName + '\'' +
                ", Balance='" + Balance + '\'' +
                ", date=" + date +
                '}';
    }
}
