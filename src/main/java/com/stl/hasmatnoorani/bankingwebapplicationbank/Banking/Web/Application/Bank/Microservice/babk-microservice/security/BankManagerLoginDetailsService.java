package com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.security;

import com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.model.BankManager;
import com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.repository.BankManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class BankManagerLoginDetailsService implements UserDetailsService {
    @Autowired
    BankManagerRepository bankManagerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        BankManager bankManager = bankManagerRepository.findById(username).get();
        return new BankManagerLoginDetails(bankManager);
    }
}
