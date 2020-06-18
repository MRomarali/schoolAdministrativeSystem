package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Classes {
    private List<Classes> classesList = new ArrayList<>();
    private int classesId;
    private String classesName;
    private List<Student> students;

    public Classes(int classesId, String classesName, List<Student> students) {
        this.classesId = classesId;
        this.classesName = classesName;
        this.students = students;
    }

    public List<Classes> getClasses() {
        return classesList;
    }

    public int getClassesId() {
        return classesId;
    }

    public String getClassesName() {
        return classesName;
    }

    public List<Student> getStudents() {
        return students;
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
