package org.example.data_access;

import org.example.Model.Classes;
import org.example.Model.Group;
import org.example.Model.Student;
import org.example.Model.Subject;

import java.util.ArrayList;
import java.util.List;

public class GroupDaoImpl implements GroupDao {
    private static List<Group> groupList;
    private static List<Student> students;
    private List<Classes> classes = new ArrayList<>();
    private List<Subject> subjects = new ArrayList<>();
    private boolean lessThan = false;
    private int maxNumberOfStudents;
    private int minNumberOfStudents;


    @Override
    public Group saveGroup(Group group) {
        if (groupList.contains(group)) {
            groupList.add(group);
            System.out.println(group.getGroupName() + "Added!");
            return group;
        }
        return null;
    }

    @Override
    public void addClass(Classes classes) {
        this.classes.add(classes);
    }

    @Override
    public void addSubject(Subject subject) {
        subjects.add(subject);
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
    public boolean setStudents(List<Student> students) {
        if (subjects.size() < maxNumberOfStudents){
            lessThan = (students.size() >= minNumberOfStudents)?true : false;
            this.students = students;
            return true;
        }
        return false;
    }

    @Override
    public Group findById(int Id) {
        for (Group group: groupList) {
            if (group.getGroupId() == Id) {
                return group;
            }
        }
        return null;
    }

    @Override
    public List<Group> findByName(String name) {
        for (Group group: groupList) {
            if (group.getGroupName().equalsIgnoreCase(name)) {
                return groupList;
            }
        }
        return null;
    }

    @Override
    public List<Group> findAll() {
        for (Group group: groupList) {
            return groupList;
        }
        return null;
    }

    @Override
    public List<Student> unplaceStudentsFromGroup(Group group) {
        List<Student> unplaced = null;
        if (students.size() < minNumberOfStudents) {
            unplaced = new ArrayList<Student>(students);
            students.clear();
        }
        for(int i=0; i< unplaced.size(); i++)
            informHeadMaster(unplaced.get(i));
        return unplaced;

    }

    @Override
    public boolean removeGroup(Group group) {
        for (Group deleteGroup: groupList) {
            if (deleteGroup.getGroupName().equals(group)) {
                groupList.remove(deleteGroup);
                System.out.println(group.getGroupName() + "Deleted!");
            }
            return true;
        }
        return false;
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
}