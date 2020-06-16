package org.example.data_access;

import org.example.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class HeadMasterDaoImpl implements HeadMasterDao {
    private List<Student> students = new ArrayList<>();

    @Override
    public Student addStudent(Student student) {
        if(!students.contains(student))
            students.add(student);
        return student;
    }
}
