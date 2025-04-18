package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class PreDeleteUserAppVerifierFactoryImpl implements PreDeleteUserAppVerifierFactory{

    public PreDeleteUserAppVerifier getVerifier(String apps){
        if(apps.equalsIgnoreCase("CAIN")){
            return new CainAppverifier();
        }else if(apps.equalsIgnoreCase("SFS")){
            return new SFSAppverifier();
        }else {
            throw new IllegalArgumentException("Ex");
        }
    }
}
