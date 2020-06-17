package org.example.data_access;

import org.example.Model.Group;
import org.example.Model.Student;
import org.example.Model.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectDaoImpl implements SubjectDao {
    private static List<Subject> subjectList = new ArrayList<>();
    private static List<Group> groupList = new ArrayList<>();
    private List<Subject> subjects = new ArrayList<>();


    @Override
    public Subject findByName(String name) {
        for (Subject subject:subjectList) {
            if (subject.getSubjectName().equalsIgnoreCase(name)) {
                return subject;
            }
        }
        return null;
    }

    @Override
    public Subject findById(int id) {
        for (Subject subject:subjectList) {
            if (subject.getSubjectId() == id) {
                return subject;
            }
        }
        return null;
    }

    @Override
    public List<Subject> findAll() {
        for (Subject subject:subjectList) {
            return subjectList;
        }
        return null;
    }

    @Override
    public Subject saveSubject(Subject subject) {
        if (!subjectList.contains(subject)) {
            subjectList.add(subject);
            System.out.println(subject.getSubjectName() + " Added!");
            return subject;
        }
        return null;
    }

    @Override
    public boolean subjectsExists(Subject subject) {
        return subjectList.contains(subject);
    }

    @Override
    public int totalNumberOfStudents() {
        return subjectList.size();
    }

    @Override
    public boolean removeSubject(Subject subject) {
        return false;
    }

    @Override
    public List<Group> getGroupsBySubject(Subject subject) {
        List<Group> groups = new ArrayList<>();
        for (Group groupsBySubject : groupList) {
            if (getSubjectsList().contains(subject)) {
                groups.add(groupsBySubject);
            }
        }
        return groups;

    }

    @Override
    public List<Subject> getSubjectsList() {
        return subjects;
    }
}
