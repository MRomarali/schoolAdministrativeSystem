package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class GradeLevel {
    private int GradeId;
    private String grade;
    private List<Subject> gradeLevelSubjects;
    private List<GradeLevel> gradeLevelList = new ArrayList<>();

    public GradeLevel(int gradeId, String grade, List<Subject> gradeLevelSubjects) {
        GradeId = gradeId;
        this.grade = grade;
        this.gradeLevelSubjects = new ArrayList<>();
    }

    public List<GradeLevel> getGradeLevel() {
        return gradeLevelList;
    }


    public int getGradeId() {
        return GradeId;
    }

    public String getGrade() {
        return grade;
    }

    public List<Subject> getGradeLevelSubjects() {
        return gradeLevelSubjects;
    }

    public void setGradeLevelSubjects(List<Subject> gradeLevelSubjects) {
        this.gradeLevelSubjects = gradeLevelSubjects;
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
