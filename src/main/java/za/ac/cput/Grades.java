package za.ac.cput;

public class Grades {
    private Class classObj;
    private Student student;
    private double grade;

    public Grades(Class classObj, Student student, double grade) {
        this.classObj = classObj;
        this.student = student;
        this.grade = grade;
    }

    public Class getClassObj() {
        return classObj;
    }

    public void setClassObj(Class classObj) {
        this.classObj = classObj;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
