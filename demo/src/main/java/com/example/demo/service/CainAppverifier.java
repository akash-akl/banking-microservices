package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class CainAppverifier implements PreDeleteUserAppVerifier{

    @Override
    public void verify() {
        System.out.println("CAIN");
    }
}
