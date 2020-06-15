package org.example.data_access;

import org.example.Model.Classes;
import org.example.Model.Student;

import java.util.List;

public interface ClassDao {
    Classes saveClass(Classes classes);
    Student register(Student student);
    Student unregister(Student student);
    Classes findById(int Id);
    List<Classes> findByName(String name);
    List<Classes>findAll();
    void informHeadMaster(Student student);
    boolean unplaceStudent(Student student);
    boolean removeClasses(Classes course);
}
