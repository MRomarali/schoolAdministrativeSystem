package org.example.data_access;

import org.example.Model.Classes;
import org.example.Model.Student;

import java.util.List;

public interface ClassDao {
    Student register(Student student);
    int totalNumberOfStudents();
    boolean studentsExists(Student student);
    Student unregister(Student student);
    void informHeadMaster(Student student);
    boolean unplaceStudent(Student student);
}
