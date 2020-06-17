package org.example.data_access;

import org.example.Model.GradeLevel;
import org.example.Model.HeadMaster;
import org.example.Model.Student;
import org.example.Model.Subject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private static List<Student> students = new ArrayList<>();
    private static List<Subject> specifiedSubject = new ArrayList<>();

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
    public Student findByAddress(String name) {
        for (Student student:students) {
            if (student.getAddress().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student findById(int id) {
        for (Student student:students) {
            if (student.getStudentId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student findByCarGiverContactNumber(int id) {
        for (Student student:students) {
            if (student.getCareGiverContactNumber() == id) {
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
    public List<Student> findByDate(LocalDate date) {
        return null;
    }

    @Override
    public Student saveStudent(Student student){
        if (!students.contains(student)) {
            students.add(student);
            System.out.println(student.getFullName() + "Added!");
            return student;
        }
        return null;
    }

    @Override
    public boolean studentsExists(Student student) {
        return students.contains(student);
    }

    @Override
    public int totalNumberOfStudents() {
        return students.size();
    }

    @Override
    public boolean deleteStudent(Student student) {
        return students.remove(student);}

    @Override
    public boolean checksStudent(Student student) {
        return students.contains(student);
    }
}
