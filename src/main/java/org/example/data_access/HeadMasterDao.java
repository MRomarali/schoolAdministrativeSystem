package org.example.data_access;

import org.example.Model.Group;
import org.example.Model.HeadMaster;
import org.example.Model.Student;

import java.util.List;

public interface HeadMasterDao {
    void createHeadMaster(int headMasterId, String headMasterName);

    HeadMaster findByName(String name);
    HeadMaster findById(int id);
    List<HeadMaster> findAll();
    Student addStudent(Student student);
}
