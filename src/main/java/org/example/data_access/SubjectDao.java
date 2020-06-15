package org.example.data_access;

import org.example.Model.Subject;

import java.util.List;

public interface SubjectDao {
    Subject saveSubject(Subject subject);
    Subject findById(int Id);
    List<Subject> findByName(String name);
    List<Subject>findAll();
    boolean removeSubject(Subject subject);
}
