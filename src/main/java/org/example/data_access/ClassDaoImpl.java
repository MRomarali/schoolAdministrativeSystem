package org.example.data_access;

import org.example.Model.Classes;
import org.example.Model.Group;
import org.example.Model.Student;
import org.example.Model.Subject;

import java.util.ArrayList;
import java.util.List;

public class ClassDaoImpl implements ClassDao {
    private static List<Classes> classesList = new ArrayList<>();
    private static List<Student> students = new ArrayList<>();

    @Override
    public Classes findByName(String name) {
        for (Classes classes:classesList) {
            if (classes.getClassesName().equalsIgnoreCase(name)) {
                return classes;
            }
        }
        return null;
    }

    @Override
    public Classes findById(int id) {
        for (Classes classes:classesList) {
            if (classes.getClassesId() == id) {
                return classes;
            }
        }
        return null;
    }

    @Override
    public List<Classes> findAll() {
        for (Classes classes:classesList) {
            return classesList;
        }
        return null;
    }

    @Override
    public Student register(Student student) {
        if(!students.contains(student))
            students.add(student);
        System.out.println(student.getFullName() + " Registered!");
        return student;
    }

    @Override
    public int totalNumberOfStudents() {
        return students.size();
    }

    @Override
    public boolean studentsExists(Student student) {
        return students.contains(student);
    }

    @Override
    public Student unregister(Student student) {
        students.remove(student);
        System.out.println(student.getFullName() + " Unregistered!");
        return student;
    }

    @Override
    public void informHeadMaster(Student student) {
        System.out.println(" Hi Headmaster! Note that: " + student.getFullName() + " With student id: " + student.getStudentId() + " has been unplaced");
    }

    @Override
    public boolean unplaceStudent(Student student) {
        for (Student stud : students){
            if (stud.equals(student)){
                students.remove(student);
                informHeadMaster(student);
                return true;
            }
        }
        return false;
    }
}