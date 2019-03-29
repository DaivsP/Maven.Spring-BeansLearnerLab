package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {


    @Autowired
    Students previousStudents;

    @Autowired
    Instructors instructors;


    @PostConstruct
    public void executeBootCamp() {
        int numberOfInstructors = instructors.size();
        int numberOfStudents = previousStudents.size();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;

        for(Instructor instructor : instructors) {
            instructor.lecture(previousStudents, numberOfHoursPerInstructor);
        }
    }

    public Students getPreviousStudents() {
        return previousStudents;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}