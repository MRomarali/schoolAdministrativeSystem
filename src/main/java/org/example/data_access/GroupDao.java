package org.example.data_access;

import org.example.Model.Classes;
import org.example.Model.Group;
import org.example.Model.Student;

import java.util.List;

public interface GroupDao {
    Group saveGroup(Group group);
    void addClass(Classes classes);
    boolean addStudentToGroup(Student stud);
    boolean setStudents(List<Student> students);
    Group findById(int Id);
    List<Group> findByName(String name);
    List<Group>findAll();
    List<Student> unplaceStudents(Group group);
    boolean removeGroup(Group group);
    boolean unplaceStudent(Student student);
    void informHeadMaster(Student student);
}
