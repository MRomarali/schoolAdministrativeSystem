package org.example.data_access;

import org.example.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class HeadMasterDaoImpl implements HeadMasterDao {
    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }
}
