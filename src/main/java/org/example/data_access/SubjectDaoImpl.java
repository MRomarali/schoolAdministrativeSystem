package org.example.data_access;

import org.example.Model.Student;
import org.example.Model.Subject;

import java.util.List;

public class SubjectDaoImpl implements SubjectDao {
    private static List<Subject> subjectList;


    @Override
    public Subject saveSubject(Subject subject) {
        if (subjectList.contains(subject)) {
            subjectList.add(subject);
            System.out.println(subject.getSubjectName() + "Added!");
            return subject;
        }
        return null;
    }

    @Override
    public Subject findById(int Id) {
        for (Subject subject:subjectList) {
            if (subject.getSubjectId() == Id) {
                return subject;
            }
        }
        return null;
    }

    @Override
    public List<Subject> findByName(String name) {
        for (Subject subject:subjectList) {
            if (subject.getSubjectName().equalsIgnoreCase(name)) {
                return subjectList;
            }
        }
        return null;
    }

    @Override
    public List<Subject> findAll() {
        return null;
    }

    @Override
    public boolean removeSubject(Subject subject) {
        return false;
    }
}
