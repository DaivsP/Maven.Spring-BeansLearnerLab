package com.example.demo;

import java.util.List;

public class Instructors extends People<Instructor>{

    Instructors(List<Instructor> personList) {
        super(personList);
    }

    Instructors(List<Instructor> personList, Integer instructors) {
        super(personList, instructors);
    }
}
