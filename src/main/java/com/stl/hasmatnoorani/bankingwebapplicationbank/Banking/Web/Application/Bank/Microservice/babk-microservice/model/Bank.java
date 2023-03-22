package com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bank_details")
public class Bank {
    @Id
    @Column(name="bank_code")
    private String bankCode;

    @Column(name="bank_name")
    private String bankName;

    @Column(name="bank_ifsc")
    private String bankIfsc;

    @Column(name="bank_address")
    private String bankAddress;

    public Bank() {
    }

    public Bank(String bankCode, String bankName, String bankIfsc, String bankAddress) {
        this.bankCode = bankCode;
        this.bankName = bankName;
        this.bankIfsc = bankIfsc;
        this.bankAddress = bankAddress;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankIfsc() {
        return bankIfsc;
    }

    public void setBankIfsc(String bankIfsc) {
        this.bankIfsc = bankIfsc;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankCode='" + bankCode + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankIfsc='" + bankIfsc + '\'' +
                ", bankAddress='" + bankAddress + '\'' +
                '}';
    }
}
