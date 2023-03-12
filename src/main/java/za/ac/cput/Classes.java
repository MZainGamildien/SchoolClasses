package za.ac.cput;

import java.util.Arrays;

public class Classes {
    private String name;
    private String teacher;
    private String[] students;

    public Classes(String name, String teacher, String[] students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public String[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}


