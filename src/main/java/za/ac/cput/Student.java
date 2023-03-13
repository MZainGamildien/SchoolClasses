/**
 * Student.java
 * This is the Student pojo class
 * @author Ferdouz Allie
 * 214038033
 * 12 March 2023
 */
package za.ac.cput;

import java.util.Objects;

public class Student {
    private String studentName;
    private String studentLastName;
    private int age;
    private int gradeLevel;

    public Student(String studentName, String studentLastName, int age, int gradeLevel) {
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.age = age;
        this.gradeLevel = gradeLevel;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", age=" + age +
                ", gradeLevel=" + gradeLevel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getAge() == student.getAge() && getGradeLevel() == student.getGradeLevel() && Objects.equals(getStudentName(), student.getStudentName()) && Objects.equals(getStudentLastName(), student.getStudentLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentName(), getStudentLastName(), getAge(), getGradeLevel());
    }
}




