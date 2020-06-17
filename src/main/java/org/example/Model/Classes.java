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

    public String getClassesName() {
        return classesName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Classes{");
        sb.append("classesId=").append(classesId);
        sb.append(", classesName='").append(classesName).append('\'');
        sb.append(", students=").append(students);
        sb.append('}');
        return sb.toString();
    }
}
