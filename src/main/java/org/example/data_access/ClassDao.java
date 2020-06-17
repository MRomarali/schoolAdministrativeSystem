package org.example.data_access;

import org.example.Model.Classes;
import org.example.Model.Group;
import org.example.Model.Student;
import org.example.Model.Subject;

import java.util.List;

public interface ClassDao {
    Classes findByName(String name);
    Classes findById(int id);
    List<Classes>findAll();
    Student register(Student student);
    int totalNumberOfStudents();
    boolean studentsExists(Student student);
    Student unregister(Student student);
    void informHeadMaster(Student student);
    boolean unplaceStudent(Student student);
}
