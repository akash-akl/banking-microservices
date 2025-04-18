package com.example.demo.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class StudentEnrollment implements Serializable {

    @Embedded
    private StudentCourseKey key;
    private Date dateTime;
}
