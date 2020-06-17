package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int groupId;
    private String groupName;
    private GradeLevel gradeLevel;
    private List<Subject> subjectsList = new ArrayList<>();
    private List<Student> studentsList = new ArrayList<>();
    private List<Classes> classesList = new ArrayList<>();
    private int min_students;
    private int max_students;
    private boolean exceedsMinimumNumber = false;



    public Group(int groupId, String groupName, GradeLevel gradeLevel, int max_students, int min_students) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.gradeLevel = gradeLevel;
        this.max_students = max_students;
        this.min_students = min_students;
    }

    public int getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void setSubjectsList(List<Subject> subjectsList) {
        this.subjectsList = subjectsList;
    }

    public List<Classes> getClassesList() {
        return classesList;
    }

    public void setClassesList(List<Classes> classesList) {
        this.classesList = classesList;
    }

    public int getMin_students() {
        return min_students;
    }

    public void setMin_students(int min_students) {
        this.min_students = min_students;
    }

    public int getMax_students() {
        return max_students;
    }

    public void setMax_students(int max_students) {
        this.max_students = max_students;
    }

    public void setExceedsMinimumNumber(boolean exceedsMinimumNumber) {
        this.exceedsMinimumNumber = exceedsMinimumNumber;
    }

    public boolean setStudents(List<Student> students) {
        if (subjectsList.size() < this.getMax_students()) {
            exceedsMinimumNumber = (students.size() >= min_students) ? true : false; //Once the minimum number of the students is exceeded, it turns to true
            this.studentsList = students;
            return true;
        }
        return false;
    }

    public List<Student> getStudents() {
        return studentsList;
    }

    public List<Subject> getSubjects() {
        return subjectsList;
    }


    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public boolean addStudentToGroup(Student st) {
        //The student should be added only if (s)he is not already in the group, and the maximum number has not been reached
        if (this.studentsList.size() < this.max_students) {
            this.studentsList.add(st);
            exceedsMinimumNumber = (this.studentsList.size() >= min_students) ? true : false; //Once the minimum number of the students is exceeded, it turns to true
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Group{");
        sb.append("groupId=").append(groupId);
        sb.append(", groupName='").append(groupName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
