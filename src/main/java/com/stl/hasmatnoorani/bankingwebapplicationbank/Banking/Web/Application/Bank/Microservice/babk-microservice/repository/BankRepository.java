package com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.repository;

import com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, String> {
}
