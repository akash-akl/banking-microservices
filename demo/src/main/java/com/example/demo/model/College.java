package com.example.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class College {
    private int id;
    private String collegeName;
    private String address;
    private String city;
}
