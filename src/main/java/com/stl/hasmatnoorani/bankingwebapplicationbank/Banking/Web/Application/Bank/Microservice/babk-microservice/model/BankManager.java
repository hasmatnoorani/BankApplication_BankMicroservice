package com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="bank_manager")
public class BankManager {
    @Id
    @Column(name = "bank_manager_email")
    private String bankManagerEmail;

    @Column(name="bank_manager_name")
    private String bankManagerName;

    @Column(name="bank_manager_password")
    private String bankManagerPassword;

    @Column(name="bank_manager_address")
    private String bankManagerAddress ;

    @Column(name="bank_manager_joining_date")
    private Date bankManagerJoiningDate;

    public BankManager() {
    }

    public BankManager(String bankManagerEmail, String bankManagerName, String bankManagerPassword, String bankManagerAddress, Date bankManagerJoiningDate) {
        this.bankManagerEmail = bankManagerEmail;
        this.bankManagerName = bankManagerName;
        this.bankManagerPassword = bankManagerPassword;
        this.bankManagerAddress = bankManagerAddress;
        this.bankManagerJoiningDate = bankManagerJoiningDate;
    }

    public String getBankManagerEmail() {
        return bankManagerEmail;
    }

    public void setBankManagerEmail(String bankManagerEmail) {
        this.bankManagerEmail = bankManagerEmail;
    }

    public String getBankManagerName() {
        return bankManagerName;
    }

    public void setBankManagerName(String bankManagerName) {
        this.bankManagerName = bankManagerName;
    }

    public String getBankManagerPassword() {
        return bankManagerPassword;
    }

    public void setBankManagerPassword(String bankManagerPassword) {
        this.bankManagerPassword = bankManagerPassword;
    }

    public String getBankManagerAddress() {
        return bankManagerAddress;
    }

    public void setBankManagerAddress(String bankManagerAddress) {
        this.bankManagerAddress = bankManagerAddress;
    }

    public Date getBankManagerJoiningDate() {
        return bankManagerJoiningDate;
    }

    public void setBankManagerJoiningDate(Date bankManagerJoiningDate) {
        this.bankManagerJoiningDate = bankManagerJoiningDate;
    }

    @Override
    public String toString() {
        return "BankManager{" +
                "bankManagerEmail='" + bankManagerEmail + '\'' +
                ", bankManagerName='" + bankManagerName + '\'' +
                ", bankManagerPassword='" + bankManagerPassword + '\'' +
                ", bankManagerAddress='" + bankManagerAddress + '\'' +
                ", bankManagerJoiningDate=" + bankManagerJoiningDate +
                '}';
    }
}
