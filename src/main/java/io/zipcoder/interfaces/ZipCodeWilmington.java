package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;

public final class ZipCodeWilmington {

    private static final ZipCodeWilmington instance = new ZipCodeWilmington();

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();;

    protected ZipCodeWilmington() {
    }

    public static ZipCodeWilmington getInstance() {
        return instance;
    }

    // students.getArray() ==> this returns Person[], not Student[]
    // students.getArray() = Students.getInstance().getArray() = INSTANCE.getArray()
    // so go to Students class (singleton) with this information

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.getStudentArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        hostLecture(instructors.findInstructorById(id), numberOfHours);
    }

}
