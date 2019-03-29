package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorsConfigTest {

    @Autowired
    @Qualifier("UsaInstructors")
    Instructors UsaInstructors;

    @Autowired
    @Qualifier("UkInstructors")
    Instructors UkInstructors;

    @Autowired
    Instructors instructors;

    @Test
    public void tcUsaInstructorsTest() {
        Assert.assertNotNull(UsaInstructors);
        Assert.assertNotNull(UsaInstructors.findById(14));
        Assert.assertNotNull(UsaInstructors.findById(15));
    }

    @Test
    public void tcUkInstructorsTest() {
        Assert.assertNotNull(UkInstructors);
        Assert.assertNotNull(UkInstructors.findById(13));
    }

    @Test
    public void InstructorsTest() {
        Assert.assertNotNull(instructors);
        Assert.assertNotNull(instructors.findById(10));
        Assert.assertNotNull(instructors.findById(11));
        Assert.assertNotNull(instructors.findById(12));
    }
}