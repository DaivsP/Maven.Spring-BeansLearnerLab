package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.util.ArrayList;

@Configuration
public class ClassroomConfig {
    Classroom classroom;

    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(){
        return classroom = new Classroom(new Instructors(new ArrayList<>()), new Students(new ArrayList<>()));
    }

    @Bean
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(){
        return classroom = new Classroom(new Instructors(new ArrayList<>()), new Students(new ArrayList<>()));
    }
}