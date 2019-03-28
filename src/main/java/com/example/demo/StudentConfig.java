package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudent(){
        Students students = new Students(new ArrayList<>());
        students.add(new Student(10, "Davis"));
        students.add(new Student(11, "Mike"));
        return students;
    }

    @Bean
    public Students previousStudents(){
        Students students = new Students(new ArrayList<>());
        students.add(new Student(12, "Davis"));
        return students;
    }
}