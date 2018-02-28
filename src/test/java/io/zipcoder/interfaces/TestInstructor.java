package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(34);
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(37);
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(75);
        Student learner = new Student(6);
        learner.setTotalStudyTime(10);
        double expected = 20.0;
        instructor.teach(learner, 10);
        double actual = learner.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(7);
        Student learner = new Student(89);
        Student secondLearner = new Student(4);
        learner.setTotalStudyTime(20);
        secondLearner.setTotalStudyTime(20);
        Learner[] learners = {learner, secondLearner};
        double expected = 30.0;
        instructor.lecture(learners, 20);
        double actual = learner.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.0);
    }
}
