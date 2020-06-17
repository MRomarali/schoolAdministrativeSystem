package org.example.data_access;

import org.example.Model.Student;
import org.example.Model.Subject;

import java.time.LocalDate;
import java.util.List;

public interface SubjectDao {
    Subject findByName(String name);
    Subject findById(int id);
    List<Subject> findAll();
    Subject saveSubject(Subject subject);
    boolean subjectsExists(Subject subject);
    int totalNumberOfStudents();
    boolean removeSubject(Subject subject);
}
