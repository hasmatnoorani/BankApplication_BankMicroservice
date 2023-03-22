package com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.controller;

import com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.idgenerator.AccountNumberGenerator;
import com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.model.CustomerBankAccount;
import com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.repository.CustomerBankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/api/v1/bank-manager/customer-bank-account")
public class CustomerBankAccountController {

    @Autowired
    CustomerBankAccountRepository customerBankAccountRepository;

    @Autowired
    AccountNumberGenerator accountNumberGenerator;


    @GetMapping ("/customer-account-approved/{account-id}")
    public String accountApproved(@PathVariable("account-id") String customerBankAccountId){
        CustomerBankAccount customerBankAccount=customerBankAccountRepository.findById(customerBankAccountId).get();
        customerBankAccount.setCustomerBankAccountNumber(accountNumberGenerator.accountNumber());
        customerBankAccount.setCustomerBankIfscCode(accountNumberGenerator.ifscCode());
        customerBankAccountRepository.save(customerBankAccount);
        customerBankAccountRepository.approved(customerBankAccountId);

        return "Approved";
    }

    @GetMapping("/customer-account-rejected/{account-id}")
    public String accountRejected(@PathVariable("account-id") String customerBankAccountNumber){
        customerBankAccountRepository.disapproved(customerBankAccountNumber);
        return "Rejected";
    }

    @GetMapping("/all-customer-bank-account")
    public List<CustomerBankAccount> getAllCustomerBankAccounts(){
        List<CustomerBankAccount> customerBankAccount = customerBankAccountRepository.findAll();
        return customerBankAccount;
    }
}
