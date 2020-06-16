package org.example.data_access;

import org.example.Model.Classes;
import org.example.Model.Group;
import org.example.Model.Student;
import org.example.Model.Subject;

import java.util.List;

public interface GroupDao {
    Group saveGroup(Group group);
    void addClass(Classes classes);
    void addSubject(Subject subject);
    boolean removeSubject(Subject subject);
    boolean addStudentToGroup(Student stud);
    int totalNumberOfStudents();
    int totalNumberOfSubjects();
    boolean checksStudent(Student student);
    boolean checksSubject(Subject subject);
    boolean setStudents(List<Student> students);
    Group findById(int Id);
    List<Group> findByName(String name);
    List<Group>findAll();
    List<Student> unplaceStudentsFromGroup(Group group);
    boolean removeGroup(Group group);
    boolean unplaceStudent(Student student);
    void informHeadMaster(Student student);
}
