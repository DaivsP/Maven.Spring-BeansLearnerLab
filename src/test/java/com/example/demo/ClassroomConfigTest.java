package com.example.demo;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassroomConfigTest {

    @Autowired
    Classroom currentCohort;

    @Autowired
    Classroom previousCohort;

    @Test
    public void testCurrentCohort(){
        Assert.assertNotNull(currentCohort);
        Assert.assertEquals(currentCohort.students.size(), new Integer(2));
        Assert.assertNotNull(currentCohort.instructors.findById(10));
    }

    @Test
    public void testPreviousCohort(){
        Assert.assertNotNull(previousCohort);
        Assert.assertEquals(previousCohort.students.size(), new Integer(1));
        Assert.assertNotNull(currentCohort.instructors.findById(10));
    }
}
