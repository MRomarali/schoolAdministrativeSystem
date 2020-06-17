package org.example.data_access;

import org.example.Model.GradeLevel;
import org.example.Model.HeadMaster;
import org.example.Model.Student;
import org.example.Model.Subject;

import java.time.LocalDate;
import java.util.List;

public interface StudentDao {
    Student findByName(String name);
    Student findByAddress(String name);
    Student findById(int id);
    Student findByCarGiverContactNumber(int id);
    List<Student> findAll();
    List<Student>findByDate(LocalDate date);
    Student saveStudent(Student student);
    boolean studentsExists(Student student);
    int totalNumberOfStudents();
    boolean deleteStudent(Student student);
    boolean checksStudent(Student student);
}
