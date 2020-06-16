package org.example.data_access;

import org.example.Model.GradeLevel;
import org.example.Model.Student;
import org.example.Model.Subject;

import java.util.List;

public interface StudentDao {
    Student saveStudent(Student student);
    boolean studentsExists(Student student);
    int totalNumberOfStudents();
    boolean deleteStudent(Student student);
    boolean checksStudent(Student student);
}
