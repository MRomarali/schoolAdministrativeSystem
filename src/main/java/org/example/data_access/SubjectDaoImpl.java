package org.example.data_access;

import org.example.Model.Student;
import org.example.Model.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectDaoImpl implements SubjectDao {
    private static List<Subject> subjectList = new ArrayList<>();

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
}
