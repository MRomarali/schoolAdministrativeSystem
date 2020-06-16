package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Classes {
    private int classesId;
    private String classesName;
    private List<Student> students;

    public Classes(int classesId, String classesName) {
        this.classesId = classesId;
        this.classesName = classesName;
        this.students = students = new ArrayList<>();
    }

    public int getClassesId() {
        return classesId;
    }

    public void setClassesId(int classesId) {
        this.classesId = classesId;
    }

    public String getClassesName() {
        return classesName;
    }

    public void setClassesName(String classesName) {
        this.classesName = classesName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Classes{");
        sb.append("id=").append(classesId);
        sb.append(", courseName='").append(classesName).append('\'');
        sb.append(", students=").append(students);
        sb.append('}');
        return sb.toString();
    }
}
