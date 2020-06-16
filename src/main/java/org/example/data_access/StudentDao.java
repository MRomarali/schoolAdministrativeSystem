package org.example.data_access;

import org.example.Model.GradeLevel;
import org.example.Model.Student;
import org.example.Model.Subject;

import java.util.List;

public interface StudentDao {
    Student saveStudent(Student student);
    Student findByName(String name);
    Student findById(int id);
    List<Student> findAll();
    boolean deleteStudent(Student student);
    List<Subject> getSpecifiedSubject();
    void addSubject(Subject subject);
    void addSpecifiedSubject(Subject specifiedSubject);
    void setSpecifiedSubject(List<Subject> specifiedSubject);
    void removeSubject(Subject subject);
}
