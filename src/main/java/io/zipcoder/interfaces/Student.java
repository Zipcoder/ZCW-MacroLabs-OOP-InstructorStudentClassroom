package io.zipcoder.interfaces;

import java.util.ArrayList;

public class Student extends Person implements Learner{


    private double totalStudyTime;



    public Student(long id) {
        super(id);
    }

    public Student(long id, String name) {


        super(name);
    }


    public void learn(double numberOfHours) {

        totalStudyTime+=numberOfHours;
    }

    public double getTotalStudyTime(){

        return totalStudyTime;
    }

    @Override
    public String toString() {
        return "Student{" + "students=" + ", totalStudyTime=" + totalStudyTime + '}';
    }
}
