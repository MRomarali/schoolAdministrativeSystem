package org.example.data_access;

import org.example.Model.Student;
import org.example.Model.Subject;

import java.util.List;

public interface SubjectDao {
    Subject saveSubject(Subject subject);
    boolean subjectsExists(Subject subject);
    int totalNumberOfStudents();
    boolean removeSubject(Subject subject);
}
