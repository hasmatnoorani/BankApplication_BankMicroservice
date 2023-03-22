package com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.controller;

import com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.jwt.JwtUtils;
import com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.model.BankManager;
import com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.repository.BankManagerRepository;
import com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.security.BankManagerLoginDetails;
import com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.security.BankManagerLoginDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/api/v1/bank-manager/auth")
public class BankManagerController {
    @Autowired
    BankManagerRepository bankManagerRepository;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtUtils jwtUtils;

    @Autowired
    BankManagerLoginDetailsService bankManagerLoginDetailsService;

    @PostMapping("/add")
    public String customer(@RequestBody BankManager bankManager) {
        try {
            bankManager.setBankManagerJoiningDate(new Date());
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            String encPass = encoder.encode(bankManager.getBankManagerPassword());
            bankManager.setBankManagerPassword(encPass);
            bankManagerRepository.save(bankManager);
            return "Bank Manager Added!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Could not add Bank Manager!";
        }
    }


    @PostMapping("/authenticate")
    public String authenticate(@RequestBody BankManager bankManager) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(bankManager.getBankManagerEmail(), bankManager.getBankManagerPassword()));
            if (authentication.isAuthenticated()) {
                BankManagerLoginDetails bankManagerLoginDetails = (BankManagerLoginDetails) bankManagerLoginDetailsService.loadUserByUsername(bankManager.getBankManagerEmail());
                String token = jwtUtils.generateJwtToken(bankManagerLoginDetails);
                return token;
            } else {
                return "Authentication Failed!";
            }
        } catch (Exception e) {
            return "Authentication Failed! Check username & password.";
        }
    }

}
