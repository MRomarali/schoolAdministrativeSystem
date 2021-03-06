package org.example.data_access;

import org.example.Model.GradeLevel;
import org.example.Model.Group;
import org.example.Model.Student;
import org.example.Model.Subject;

import java.util.List;

public interface GroupDao {
    Group findByName(String name);
    Group findById(int id);
    List<Group>findAll();
    List<Subject> getSubjectsList();
    List<Student> getStudentsList();
    void addSubject(Subject subject);
    void addStudent(Student student);
    boolean removeStudent(Student student);
    boolean removeSubject(Subject subject);

    void createSubject(int subjectId, String subjectName);

    boolean addStudentToGroup(int id, Student student);

    boolean addSubject(int id, Subject subject);

    void createGroup(int id, String groupName, GradeLevel level, int maxStudents, int minStudents);

    int totalNumberOfStudents();
    int totalNumberOfSubjects();
    boolean checksStudent(Student student);
    boolean checksSubject(Subject subject);
    boolean unplaceStudent(Student student);
    void informHeadMaster(Student student);
    boolean isExceedsMinimumNumber();
}
