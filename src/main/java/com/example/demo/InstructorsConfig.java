package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;

@Configuration
public class InstructorsConfig {

    private Instructors instructors;

    @Bean
    public Instructors tcUsaInstructors(){
        return instructors = new Instructors(new ArrayList<>(), 6);
    }

    @Bean
    public Instructors tcUkInstructors(){
        return instructors = new Instructors(new ArrayList<>(), 7);
    }

    @Bean
    @Primary
    public Instructors instructors(){
        return instructors = new Instructors(new ArrayList<>(), 5);
    }
}