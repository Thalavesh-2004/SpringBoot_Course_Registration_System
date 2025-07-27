package com.example.CourseRegistrationSystem.repository;

import com.example.CourseRegistrationSystem.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {
}
