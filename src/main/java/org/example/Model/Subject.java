package org.example.Model;

import java.util.List;

public class Subject {
    private int subjectId;
    private String subjectName;
    private List<Student> students;

    public Subject(int subjectId, String subjectName, List<Student> students) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.students = students;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Subject{");
        sb.append("subjectId=").append(subjectId);
        sb.append(", subjectName='").append(subjectName).append('\'');
        sb.append(", students=").append(students);
        sb.append('}');
        return sb.toString();
    }
}
