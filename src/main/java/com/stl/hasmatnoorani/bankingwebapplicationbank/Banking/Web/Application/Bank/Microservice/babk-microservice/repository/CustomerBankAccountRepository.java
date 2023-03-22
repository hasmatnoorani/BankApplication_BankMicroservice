package com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.repository;

import com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.model.CustomerBankAccount;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerBankAccountRepository extends JpaRepository<CustomerBankAccount,String> {

    @Transactional
    @Modifying
    @Query(value ="update customer_bank_accounts  set customer_account_status=1 where customer_bank_account_id=? " ,nativeQuery = true)
    public void approved(String accountId);

    @Transactional
    @Modifying
    @Query(value ="update customer_bank_accounts  set customer_account_status=-1 where customer_bank_account_id=? " ,nativeQuery = true)
    public void disapproved(String accountId);
}
