package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class GradeLevel {
    private int GradeId;
    private String grade;
    private List<Subject> commonSubjects;
    private List<Subject> individualChosenSubjects;
    public GradeLevel(int gradeId, String grade) {
        GradeId = gradeId;
        this.grade = grade;
        commonSubjects = new ArrayList<Subject>();
        individualChosenSubjects = new ArrayList<Subject>();
    }

    public int getGradeId() {
        return GradeId;
    }

    public String getGrade() {
        return grade;
    }

    public List<Subject> getCommonSubjects() {
        return commonSubjects;
    }

    public List<Subject> getIndividualChosenSubjects() {
        return individualChosenSubjects;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GradeLevel{");
        sb.append("GradeId=").append(GradeId);
        sb.append(", grade='").append(grade).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
