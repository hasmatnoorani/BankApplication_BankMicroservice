package com.stl.hasmatnoorani.bankingwebapplicationbank.Banking.Web.Application.Bank.Microservice.idgenerator;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class AccountNumberGenerator {

    public String bankCode() {
        return "6909";
    }
    public String ifscCode() {
        return "FINX"+bankCode();
    }

    public String accountNumber() {

        Random random=new Random();
        String a="";


        for (int i=0;i<11;i++) {
            a=a+random.nextInt(10);
        }

        String ac=ifscCode().substring(4)+a;
        return ac;

    }
    public String transactionId() {

        Random random=new Random();
        String t="";


        for (int i=0;i<8;i++) {
            t=t+random.nextInt(10);
        }

        String id=ifscCode()+"-"+accountNumber().substring(7,15)+"-"+t;
        return id;

    }

}
