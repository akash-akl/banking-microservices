package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class SFSAppverifier implements PreDeleteUserAppVerifier{

    @Override
    public void verify() {
        System.out.println("SFS");
    }
}
