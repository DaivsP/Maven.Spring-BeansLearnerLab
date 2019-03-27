package com.example.demo;

import java.util.ArrayList;

public class Instructor extends Person implements Teacher{
    Iterable<? extends Learner> learners;
    public Instructor(long id, String name) {
        super(id, name);
        learners = new ArrayList<>();
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        for (Learner learner : learners) {
            teach(learner, numberOfHoursPerLearner((ArrayList) this.learners, numberOfHours));
        }
    }

    private double numberOfHoursPerLearner(ArrayList learners, double numberOfHours){
        return numberOfHours / learners.size();
    }
}
