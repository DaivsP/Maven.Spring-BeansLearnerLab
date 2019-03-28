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
        Assert.assertEquals(currentStudents.size(), new Integer(2));
    }

    @Test
    public void previousStudentsTest() {
        Assert.assertNotNull(previousStudents);
        Assert.assertEquals(previousStudents.size(), new Integer(1));
    }

    //adding new lines to have to do save
}