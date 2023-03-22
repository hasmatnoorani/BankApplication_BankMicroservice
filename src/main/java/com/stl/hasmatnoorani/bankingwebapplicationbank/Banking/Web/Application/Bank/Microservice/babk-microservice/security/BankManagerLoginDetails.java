package com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.security;

import com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.model.BankManager;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class BankManagerLoginDetails implements UserDetails {

    private static final long serialVersionUID = 1L;

    BankManager bankManager = new BankManager();

    public BankManagerLoginDetails(BankManager bankManager) {
        super();
        this.bankManager = bankManager;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("BANK-MANAGER"));
    }

    @Override
    public String getPassword() {
        return bankManager.getBankManagerPassword();
    }

    @Override
    public String getUsername() {
        return bankManager.getBankManagerEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
