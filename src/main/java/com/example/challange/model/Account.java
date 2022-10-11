package com.example.challange.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "account_number",unique=true,nullable = false,columnDefinition="VARCHAR(64)")
    private String accountNumber;
    @Column(name = "id")
    private int id;
    @Column(name = "account_type")
    private String accountType; //Term Investment, Loan, Saving
    @Column(name = "account_name")
    private String accountName;
    @Column(name = "balance")
    private String balance;
    @Column(name = "date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss")
    private Date date;

    public Account() {
    }

    public Account(String accountNumber, int id, String accountType, String accountName, String balance, Date date) {
        this.accountNumber = accountNumber;
        this.id = id;
        this.accountType = accountType;
        this.accountName = accountName;
        balance = balance;
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
        return balance;
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
        this.balance = balance;
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
                ", Balance='" + balance + '\'' +
                ", date=" + date +
                '}';
    }
}
