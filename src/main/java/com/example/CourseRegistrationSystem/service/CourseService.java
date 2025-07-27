package com.example.CourseRegistrationSystem.service;

import com.example.CourseRegistrationSystem.model.Course;
import com.example.CourseRegistrationSystem.model.CourseRegistry;
import com.example.CourseRegistrationSystem.repository.CourseRegistryRepo;
import com.example.CourseRegistrationSystem.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courserepo;
    @Autowired
    CourseRegistryRepo courseregistryrepo;

    public List<Course> availableCourses() {
        return courserepo.findAll();
    }

    public List<CourseRegistry> enrollStudents() {
        return courseregistryrepo.findAll();
    }

    public String enroll(String name,String emailId,String courseName) {
        courseregistryrepo.save(new CourseRegistry(name,emailId,courseName));
        return "Congratulations "+name+" Enrollment successful for "+courseName;
    }
}
