package com.example.demo;

import java.util.List;

public class Students extends People<Student>{

    Students(List<Student> personList) {
        super(personList);
    }

    Students(List<Student> personList, Integer students) {
        super(personList, students);
    }
}
