package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;

@Configuration
public class InstructorsConfig {

    @Bean(name = "UsaInstructors")
    public Instructors tcUsaInstructors(){
        Instructors instructors = new Instructors(new ArrayList<>());
        instructors.add(new Instructor(14, "Davis"));
        instructors.add(new Instructor(15, "Mike"));
        return instructors;
    }

    @Bean(name = "UkInstructors")
    public Instructors tcUkInstructors(){
        Instructors instructors = new Instructors(new ArrayList<>());
        instructors.add(new Instructor(13, "Davis"));
        return instructors;
    }

    @Bean
    @Primary
    public Instructors instructors(){
        Instructors instructors = new Instructors(new ArrayList<>());
        instructors.add(new Instructor(10, "Davis"));
        instructors.add(new Instructor(11, "Cara"));
        instructors.add(new Instructor(12, "Sean"));
        return instructors;
    }
}