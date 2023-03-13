package za.ac.cput;

import java.util.Objects;

public class Teacher {
    private String teacherName;
    private String teacherSubject;
    private int teacherExperienceYears;

    public Teacher(String teacherName,String teacherSubject,int teacherExperienceYears) {
        this.teacherName = teacherName;
        this.teacherSubject=teacherSubject;
        this.teacherExperienceYears=teacherExperienceYears;

    }

    public String getTeacherName() {

        return teacherName;
    }

    public String getTeacherSubject() {

        return teacherSubject;
    }

    public int getTeacherExperienceYears() {

        return teacherExperienceYears;
    }

    public void setTeacherName(String teacherName) {

        this.teacherName = teacherName;
    }

    public void setTeacherSubject(String teacherSubject) {

        this.teacherSubject = teacherSubject;
    }

    public void setTeacherExperienceYears(int teacherExperienceYears) {
        this.teacherExperienceYears = teacherExperienceYears;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherName='" + teacherName + '\'' +
                ", teacherSubject='" + teacherSubject + '\'' +
                ", teacherExperienceYears=" + teacherExperienceYears +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher teacher)) return false;
        return teacherExperienceYears == teacher.teacherExperienceYears && teacherName.equals(teacher.teacherName)
                && teacherSubject.equals(teacher.teacherSubject);

    }
}
