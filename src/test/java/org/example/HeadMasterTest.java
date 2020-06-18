package org.example;

import org.example.Model.*;
import org.example.data_access.HeadMasterDaoImpl;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HeadMasterTest {
    private HeadMaster hm = new HeadMaster(1,"sam");
    private List<HeadMaster> headMasters = new ArrayList<>();
    private List<Subject> subjectList = new ArrayList<>();
    private HeadMasterDaoImpl headMasterDaoImpl = new HeadMasterDaoImpl();
    private Student student1;

    @Test
    public void createHeadMaster() throws Exception{
        headMasterDaoImpl.createHeadMaster(1, "Sam");
        headMasterDaoImpl.addHeadMaster(1,hm);
        assertEquals(headMasterDaoImpl.findById(1).getHeadmaster().size(),1);
    }

    @Test
    public void findByName() throws Exception{
        headMasterDaoImpl.createHeadMaster(1, "Sam");
        headMasterDaoImpl.addHeadMaster(1,hm);
        assertEquals("Sam",headMasterDaoImpl.findByName("Sam").getHeadMasterName());

    }


    @Test
    public void testToString() throws Exception {
        headMasters = new ArrayList<HeadMaster>();
        headMasters.add(new HeadMaster(1, "Sam"));

        for (HeadMaster headMaster : headMasters) {
            assertEquals(headMaster.toString(), "HeadMaster{headMasterId="+headMaster.getHeadMasterId()+"," + " headMasterName="+ "'"+headMaster.getHeadMasterName()+"'}");
        }
    }
    @Test
    public void testToStrings() throws Exception {

        assertEquals(1, hm.getHeadMasterId());
        assertEquals("sam", hm.getHeadMasterName());
    }

    @Test
    public void headMasterId() throws Exception {
        hm = new HeadMaster(1,"Sam");
        assertEquals(1,hm.getHeadMasterId());
    }

    @Test
    public void headMasterName() throws Exception {
        hm = new HeadMaster(1,"Sam");
        assertEquals("Sam",hm.getHeadMasterName());
    }

    @Test
    public void addStudent() throws Exception {
        assertEquals(student1, headMasterDaoImpl.addStudent(student1));
    }
}
