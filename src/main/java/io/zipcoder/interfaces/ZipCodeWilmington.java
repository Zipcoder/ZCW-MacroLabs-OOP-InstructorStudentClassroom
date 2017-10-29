package io.zipcoder.interfaces;

public final class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private static Students students;
    private static Instructors instructors;

    private ZipCodeWilmington() {
        Students students = Students.getInstance();
        Instructors instructors = Instructors.getInstance();
    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture((Learner[]) students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Teacher teacher = (Teacher) instructors.findById(id);
        teacher.lecture((Learner[]) students.getArray(), numberOfHours);
    }

}
