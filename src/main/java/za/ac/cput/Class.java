/**
 * TestClass.java
 * This is the Class used for doing testing on the CLasses Pojo
 * @author Carlo Joseph
 * 12 March 2023
 */
package za.ac.cput;
public class Class {
    private String name;
    private String teacher;
    private String students;

    public Class(String name, String teacher, String students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }
    private Class(){}
    // getters and setters
    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", students=" + students+
                '}';
    }
}


