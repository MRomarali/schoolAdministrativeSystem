package org.example.data_access;

import org.example.Model.*;

import java.util.ArrayList;
import java.util.List;

public class HeadMasterDaoImpl implements HeadMasterDao {
    private List<Student> students = new ArrayList<>();
    private List<HeadMaster> headMasterList = new ArrayList<>();

    @Override
    public void createHeadMaster(int headMasterId, String headMasterName){
        HeadMaster headMaster = new HeadMaster(headMasterId, headMasterName);
        headMasterList.add(headMaster);
    }

    @Override
    public boolean addHeadMaster(int id, HeadMaster headMaster){
        HeadMaster master = findById(id);
        List<HeadMaster> masterList = master.getHeadmaster();
        masterList.add(master);
        return true;
    }

    @Override
    public HeadMaster findByName(String name) {
        for (HeadMaster headMaster:headMasterList) {
            if (headMaster.getHeadMasterName().equalsIgnoreCase(name)) {
                return headMaster;
            }
        }
        return null;
    }

    @Override
    public HeadMaster findById(int id) {
        for (HeadMaster headMaster:headMasterList) {
            if (headMaster.getHeadMasterId() == id) {
                return headMaster;
            }
        }
        return null;
    }

    @Override
    public List<HeadMaster> findAll() {
        for (HeadMaster headMaster:headMasterList) {
            return headMasterList;
        }
        return null;
    }

    @Override
    public Student addStudent(Student student) {
        if(!students.contains(student))
            students.add(student);
        return student;
    }
}
