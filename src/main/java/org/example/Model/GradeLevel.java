package org.example.Model;

import java.util.List;

public class GradeLevel {
    private int GradeId;
    private String grade;
    private int nrOfStudents;
    private List<Student> students;

    public GradeLevel(int gradeId, String grade, int nrOfStudents, List<Student> students) {
        GradeId = gradeId;
        this.grade = grade;
        this.nrOfStudents = nrOfStudents;
        this.students = students;
    }

    public int getGradeId() {
        return GradeId;
    }

    public void setGradeId(int gradeId) {
        GradeId = gradeId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getNrOfStudents() {
        return nrOfStudents;
    }

    public void setNrOfStudents(int nrOfStudents) {
        this.nrOfStudents = nrOfStudents;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GradeLevel{");
        sb.append("GradeId=").append(GradeId);
        sb.append(", grade='").append(grade).append('\'');
        sb.append(", nrOfStudents=").append(nrOfStudents);
        sb.append(", students=").append(students);
        sb.append('}');
        return sb.toString();
    }
}
