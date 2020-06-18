package org.example.data_access;

import org.example.Model.Group;
import org.example.Model.Student;
import org.example.Model.Subject;

import java.time.LocalDate;
import java.util.List;

public interface SubjectDao {
    boolean addSubject(int id, Subject subject);

    void createSubject(int subjectId, String subjectName);

    Subject findByName(String name);
    Subject findById(int id);
    List<Subject> findAll();
    Subject saveSubject(Subject subject);
    boolean subjectsExists(Subject subject);
    int totalNumberOfStudents();
    boolean removeSubject(Subject subject);
    List<Group> getGroupsBySubject(Subject subject);
    List<Subject> getSubjectsList();
}
