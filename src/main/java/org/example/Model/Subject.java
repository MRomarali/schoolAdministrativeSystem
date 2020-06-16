package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int subjectId;
    private String subjectName;

    public Subject(int subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Subject{");
        sb.append("subjectId=").append(subjectId);
        sb.append(", subjectName='").append(subjectName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
