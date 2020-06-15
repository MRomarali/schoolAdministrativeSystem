package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int groupId;
    private String groupName;
    private List<Student> students;
    private GradeLevel gradeLevel;

    public Group(int groupId, String groupName, List<Student> students, GradeLevel gradeLevel) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.students = students;
        this.gradeLevel = gradeLevel;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public int totalNumberOfStudents() {
        return students.size();
    }
    public boolean checksStudent(Student student) {
        return students.contains(student);
    }


    public List<Student> getRegisteredStudents() {
        return students;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Group{");
        sb.append("groupId=").append(groupId);
        sb.append(", groupName='").append(groupName).append('\'');
        sb.append(", students=").append(students);
        sb.append(", gradeLevel=").append(gradeLevel);
        sb.append('}');
        return sb.toString();
    }
}
