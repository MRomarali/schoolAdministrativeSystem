package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class GradeLevel {
    private int GradeId;
    private String grade;
    private List<Subject> GradeLevelSubjects;

    public GradeLevel(int gradeId, String grade, List<Subject> gradeLevelSubjects) {
        GradeId = gradeId;
        this.grade = grade;
        GradeLevelSubjects = gradeLevelSubjects;
    }

    public int getGradeId() {
        return GradeId;
    }

    public String getGrade() {
        return grade;
    }

    public List<Subject> getGradeLevelSubjects() {
        return GradeLevelSubjects;
    }

    public void setGradeLevelSubjects(List<Subject> gradeLevelSubjects) {
        GradeLevelSubjects = gradeLevelSubjects;
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
