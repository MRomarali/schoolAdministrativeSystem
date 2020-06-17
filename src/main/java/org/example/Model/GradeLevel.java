package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class GradeLevel {
    private int GradeId;
    private String grade;
    public GradeLevel(int gradeId, String grade) {
        GradeId = gradeId;
        this.grade = grade;
    }

    public int getGradeId() {
        return GradeId;
    }

    public String getGrade() {
        return grade;
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
