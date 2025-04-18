package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{

    @Autowired
    PreDeleteUserAppVerifierFactory preDeleteUserAppVerifierFactory;

    @Override
    public void getData() {

        List<String> list = new ArrayList<>();
        list.add("CAIN");
        list.add("SFS");
        for(String app : list){
        preDeleteUserAppVerifierFactory.getVerifier(app).verify();
        }
    }
}
