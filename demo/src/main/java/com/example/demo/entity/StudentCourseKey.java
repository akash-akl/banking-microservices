package com.example.demo.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@AllArgsConstructor
@Getter
@Setter

public class StudentCourseKey implements Serializable {

    private int studdentId;
    private int courseId;


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StudentCourseKey that = (StudentCourseKey) o;
        return studdentId == that.studdentId && courseId == that.courseId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studdentId, courseId);
    }
}
