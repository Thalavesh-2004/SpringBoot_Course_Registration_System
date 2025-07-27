package com.example.CourseRegistrationSystem.controller;

import com.example.CourseRegistrationSystem.model.Course;
import com.example.CourseRegistrationSystem.model.CourseRegistry;
import com.example.CourseRegistrationSystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5501")

public class CourseController {
    @Autowired
    CourseService courseservice;
    @GetMapping("/courses")
    public List<Course> availableCourses(){
    return courseservice.availableCourses();
    }

    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseservice.enrollStudents();
    }

    @PostMapping("courses/enroll")
    public String enroll(@RequestParam("name")String name,
                         @RequestParam("emailId")String emailId,
                         @RequestParam("courseName")String courseName){

        return courseservice.enroll(name,emailId,courseName);
    }
}
