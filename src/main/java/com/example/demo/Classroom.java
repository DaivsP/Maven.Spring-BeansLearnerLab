package com.example.demo;

public class Classroom {
    Instructors instructors;
    Students students;

    Classroom(Instructors instructors, Students students){
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.personList, numberOfHours);
    }
}
