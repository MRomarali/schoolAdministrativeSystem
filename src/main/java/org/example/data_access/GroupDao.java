package org.example.data_access;

import org.example.Model.Classes;
import org.example.Model.Group;
import org.example.Model.Student;
import org.example.Model.Subject;

import java.util.List;

public interface GroupDao {
    void addSubject(Subject subject);
    void addStudent(Student student);
    boolean removeStudent(Student student);
    boolean removeSubject(Subject subject);
    boolean addStudentToGroup(Student stud);
    int totalNumberOfStudents();
    int totalNumberOfSubjects();
    boolean checksStudent(Student student);
    boolean checksSubject(Subject subject);
    boolean unplaceStudent(Student student);
    void informHeadMaster(Student student);
}
