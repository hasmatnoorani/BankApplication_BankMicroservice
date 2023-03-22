package com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="customer_bank_accounts")
public class CustomerBankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="customer_bank_account_id")
    private String customerBankAccountId;

    @Column(name="customer_bank_account_number")
    private String customerBankAccountNumber;

    @Column(name="customer_bank_ifsc_code")
    private String customerBankIfscCode;

    @Column(name="customer_bank_account_type")
    private String customerBankAccountType;

    @Column(name="customer_name")
    private String customerName;

    @Column(name="customer_email")
    private String customerEmail;

    @Column(name="customer_date_of_birth")
    private Date customerDateOfBirth;

    @Column(name="customer_gender")
    private String customerGender;

    @Column(name="customer_father_name")
    private String customerFatherName;

    @Column(name="customer_mother_name")
    private String customerMotherName;

    @Column(name="customer_permanent_address")
    private String customerPermanentAddress;

    @Column(name="customer_phone_number")
    private String customerPhoneNumber;

    @Column(name="customer_id_proof_type")
    private String customerIdProofType;

    @Column(name="customer_id_proof_number")
    private String customerIdProofNumber;

    @Column(name="customer_id_proof_file")
    private String customerIdProofFile;

    @Column(name="customer_nominee_name")
    private String customerNomineeName;

    @Column(name="customer_nominee_address")
    private String customerNomineeAddress;

    @Column(name = "customer_account_status")
    private int customerAccountStatus;

    public CustomerBankAccount() {
    }

    public CustomerBankAccount(String customerBankAccountId, String customerBankAccountNumber, String customerBankIfscCode, String customerBankAccountType, String customerName, String customerEmail, Date customerDateOfBirth, String customerGender, String customerFatherName, String customerMotherName, String customerPermanentAddress, String customerPhoneNumber, String customerIdProofType, String customerIdProofNumber, String customerIdProofFile, String customerNomineeName, String customerNomineeAddress, int customerAccountStatus) {
        this.customerBankAccountId = customerBankAccountId;
        this.customerBankAccountNumber = customerBankAccountNumber;
        this.customerBankIfscCode = customerBankIfscCode;
        this.customerBankAccountType = customerBankAccountType;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerDateOfBirth = customerDateOfBirth;
        this.customerGender = customerGender;
        this.customerFatherName = customerFatherName;
        this.customerMotherName = customerMotherName;
        this.customerPermanentAddress = customerPermanentAddress;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerIdProofType = customerIdProofType;
        this.customerIdProofNumber = customerIdProofNumber;
        this.customerIdProofFile = customerIdProofFile;
        this.customerNomineeName = customerNomineeName;
        this.customerNomineeAddress = customerNomineeAddress;
        this.customerAccountStatus = customerAccountStatus;
    }

    public String getCustomerBankAccountId() {
        return customerBankAccountId;
    }

    public void setCustomerBankAccountId(String customerBankAccountId) {
        this.customerBankAccountId = customerBankAccountId;
    }

    public String getCustomerBankAccountNumber() {
        return customerBankAccountNumber;
    }

    public void setCustomerBankAccountNumber(String customerBankAccountNumber) {
        this.customerBankAccountNumber = customerBankAccountNumber;
    }

    public String getCustomerBankIfscCode() {
        return customerBankIfscCode;
    }

    public void setCustomerBankIfscCode(String customerBankIfscCode) {
        this.customerBankIfscCode = customerBankIfscCode;
    }

    public String getCustomerBankAccountType() {
        return customerBankAccountType;
    }

    public void setCustomerBankAccountType(String customerBankAccountType) {
        this.customerBankAccountType = customerBankAccountType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Date getCustomerDateOfBirth() {
        return customerDateOfBirth;
    }

    public void setCustomerDateOfBirth(Date customerDateOfBirth) {
        this.customerDateOfBirth = customerDateOfBirth;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerFatherName() {
        return customerFatherName;
    }

    public void setCustomerFatherName(String customerFatherName) {
        this.customerFatherName = customerFatherName;
    }

    public String getCustomerMotherName() {
        return customerMotherName;
    }

    public void setCustomerMotherName(String customerMotherName) {
        this.customerMotherName = customerMotherName;
    }

    public String getCustomerPermanentAddress() {
        return customerPermanentAddress;
    }

    public void setCustomerPermanentAddress(String customerPermanentAddress) {
        this.customerPermanentAddress = customerPermanentAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerIdProofType() {
        return customerIdProofType;
    }

    public void setCustomerIdProofType(String customerIdProofType) {
        this.customerIdProofType = customerIdProofType;
    }

    public String getCustomerIdProofNumber() {
        return customerIdProofNumber;
    }

    public void setCustomerIdProofNumber(String customerIdProofNumber) {
        this.customerIdProofNumber = customerIdProofNumber;
    }

    public String getCustomerIdProofFile() {
        return customerIdProofFile;
    }

    public void setCustomerIdProofFile(String customerIdProofFile) {
        this.customerIdProofFile = customerIdProofFile;
    }

    public String getCustomerNomineeName() {
        return customerNomineeName;
    }

    public void setCustomerNomineeName(String customerNomineeName) {
        this.customerNomineeName = customerNomineeName;
    }

    public String getCustomerNomineeAddress() {
        return customerNomineeAddress;
    }

    public void setCustomerNomineeAddress(String customerNomineeAddress) {
        this.customerNomineeAddress = customerNomineeAddress;
    }

    public int getCustomerAccountStatus() {
        return customerAccountStatus;
    }

    public void setCustomerAccountStatus(int customerAccountStatus) {
        this.customerAccountStatus = customerAccountStatus;
    }

    @Override
    public String toString() {
        return "CustomerBankAccount{" +
                "customerBankAccountId='" + customerBankAccountId + '\'' +
                ", customerBankAccountNumber='" + customerBankAccountNumber + '\'' +
                ", customerBankIfscCode='" + customerBankIfscCode + '\'' +
                ", customerBankAccountType='" + customerBankAccountType + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerDateOfBirth=" + customerDateOfBirth +
                ", customerGender='" + customerGender + '\'' +
                ", customerFatherName='" + customerFatherName + '\'' +
                ", customerMotherName='" + customerMotherName + '\'' +
                ", customerPermanentAddress='" + customerPermanentAddress + '\'' +
                ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                ", customerIdProofType='" + customerIdProofType + '\'' +
                ", customerIdProofNumber='" + customerIdProofNumber + '\'' +
                ", customerIdProofFile='" + customerIdProofFile + '\'' +
                ", customerNomineeName='" + customerNomineeName + '\'' +
                ", customerNomineeAddress='" + customerNomineeAddress + '\'' +
                ", customerAccountStatus=" + customerAccountStatus +
                '}';
    }
}


