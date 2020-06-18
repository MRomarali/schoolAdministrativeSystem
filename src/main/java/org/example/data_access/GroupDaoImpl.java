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
    public boolean addSubject(int id, Subject subject){
        Group group = findById(id);
        List<Subject> subjects = group.getSubjects();
        subjects.add(subject);
        return true;
    }

    @Override
    public void createSubject(int subjectId, String subjectName){
        Subject subject = new Subject(subjectId, subjectName);
        subjects.add(subject);
    }

    @Override
    public boolean addStudentToGroup(int id, Student student){
        Group group = findById(id);
        List<Student> students = group.getStudents();
        if (students.size() < group.getMax_students()) {
            students.add(student);
            lessThan = students.size() >= group.getMin_students(); //Once the minimum number of the students is exceeded, it turns to true
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void createGroup(int id, String groupName, GradeLevel level, int maxStudents, int minStudents){
        Group  group = new Group(id, groupName, level, maxStudents , minStudents);
        groupList.add(group);
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
