package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentConfigTest {


    @Autowired
    @Qualifier("students")
    Students currentStudents;

    @Autowired
    Students previousStudents;

    @Test
    public void currentStudentTest() {
        Assert.assertNotNull(currentStudents);
    }

    @Test
    public void previousStudentsTest() {
        Assert.assertNotNull(previousStudents);
    }
}