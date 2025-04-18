package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "COURSE")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COURSE_ID")
    private Long id;

    @Column(name = "COURSE_NAME")
    private String courseName;

    @ManyToMany(mappedBy = "courses")
    List<Student> students = new ArrayList<>();
}
