package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    private final static ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private final static Students students = Students.getInstance();

    private final static Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington() {
    }

    public static ZipCodeWilmington getInstance() {

        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getStudentArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor = (Instructor) instructors.findByID(id);
        instructor.lecture(students.getStudentArray(), numberOfHours);
    }
}
