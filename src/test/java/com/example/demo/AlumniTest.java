package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlumniTest {

    @Autowired
    Alumni alumni;

    @Test
    public void executeBootCampTest(){
        //When
        Student student = alumni.getPreviousStudents().findById(12);
        double actual = student.getTotalStudyTime();

        double expected = 1200;

        Assert.assertEquals(expected, actual, 0);
    }
}
