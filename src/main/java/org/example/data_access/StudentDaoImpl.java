package org.example.data_access;

import org.example.Model.GradeLevel;
import org.example.Model.Student;
import org.example.Model.Subject;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private static List<Student> students = new ArrayList<>();
    private static List<GradeLevel> gradeLevel = new ArrayList<>();
    private static List<Subject> specifiedSubject = new ArrayList<>();

    @Override
    public Student saveStudent(Student student){
        if (students.contains(student)) {
            students.add(student);
            System.out.println(student.getFullName() + "Added!");
            return student;
        }
        return null;
    }


    @Override
    public Student findByName(String name) {
        for (Student student:students) {
            if (student.getFullName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student findById(int id) {
        for (Student student:students) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        for (Student student:students) {
            return students;
        }
        return null;
    }

    @Override
    public boolean deleteStudent(Student student) {
        for (Student removeStudent:students) {
            if (removeStudent.getFullName().equals(student)) {
                students.remove(removeStudent);
            }
        }
        return false;
    }

    @Override
    public List<Subject> getSpecifiedSubject() {
        return specifiedSubject;
    }

    @Override
    public void addSubject(Subject subject) {

        if (!this.specifiedSubject.contains(subject)) {
            this.specifiedSubject.add(subject);
        }
    }

    @Override
    public void addSpecifiedSubject(Subject specifiedSubject) {
        this.specifiedSubject.add(specifiedSubject);
    }

    @Override
    public void setSpecifiedSubject(List<Subject> specifiedSubject) {
        this.specifiedSubject = specifiedSubject;
    }

    @Override
    public void removeSubject(Subject subject) {
        this.specifiedSubject.remove(subject);
    }
}
