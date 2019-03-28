package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class StudentConfig {
    private Students students;

    @Bean(name = "students")
    public Students currentStudent(){
        return students = new Students(new ArrayList<>(), 40);
    }

    @Bean
    public Students previousStudents(){
        return students = new Students(new ArrayList<>(), 35);
    }
}