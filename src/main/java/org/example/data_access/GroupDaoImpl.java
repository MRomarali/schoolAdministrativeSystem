package org.example.data_access;

import org.example.Model.*;

import java.util.ArrayList;
import java.util.List;

public class GroupDaoImpl implements GroupDao {
    private static List<Group> groupList = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private List<Subject> subjects = new ArrayList<>();
    private List<Classes> classesList = new ArrayList<>();
    private boolean lessThan = false;
    private int maxNumberOfStudents;
    private int minNumberOfStudents;
    private boolean exceedsMinimumNumber = false;


    @Override
    public Group findByName(String name) {
        for (Group group:groupList) {
            if (group.getGroupName().equalsIgnoreCase(name)) {
                return group;
            }
        }
        return null;
    }

    @Override
    public Group findById(int id) {
        for (Group group:groupList) {
            if (group.getGroupId() == id) {
                return group;
            }
        }
        return null;
    }

    @Override
    public List<Group> findAll() {
        for (Group group:groupList) {
            return groupList;
        }
        return null;
    }

    @Override
    public List<Subject> getSubjectsList() {
        return subjects;
    }

    @Override
    public List<Student> getStudentsList() {
        return students;
    }


    @Override
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public boolean removeStudent(Student student) {
        return students.remove(student);
    }

    @Override
    public boolean removeSubject(Subject subject) {
        return subjects.remove(subject);
    }

    @Override
    public boolean addStudentToGroup(Student stud) {
        //The student should be added only if (s)he is not already in the group, and the maximum number has not been reached
        if (this.students.size() < this.maxNumberOfStudents) {
            this.students.add(stud);
            lessThan = (this.students.size() >= minNumberOfStudents) ? true : false; //Once the minimum number of the students is exceeded, it turns to true
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int totalNumberOfStudents() {
        return students.size();
    }

    @Override
    public int totalNumberOfSubjects() {
        return subjects.size();
    }

    @Override
    public boolean checksStudent(Student student) {
        return students.contains(student);
    }

    @Override
    public boolean checksSubject(Subject subject) {
        return subjects.contains(subject);
    }


    @Override
    public boolean unplaceStudent(Student student) {
        informHeadMaster(student);
        return students.remove(student);
    }

    @Override
    public void informHeadMaster(Student student) {
        System.out.println(" Hi Headmaster! Note that: " + student.getFullName() + " With student id: " + student.getStudentId() + " has been unplaced");
    }

    @Override
    public boolean isExceedsMinimumNumber() {
        return exceedsMinimumNumber;
    }
}
