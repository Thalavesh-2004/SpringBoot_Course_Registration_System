package com.example.CourseRegistrationSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.management.ConstructorParameters;

@Data
@RequiredArgsConstructor
@Entity
public class CourseRegistry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//no need to provide value
    private int id;
    private String name;
    private String emailId;
    private String CourseName;

    public CourseRegistry(String name, String emailId, String courseName) {
        this.CourseName=courseName;
        this.name=name;
        this.emailId=emailId;
    }
}
