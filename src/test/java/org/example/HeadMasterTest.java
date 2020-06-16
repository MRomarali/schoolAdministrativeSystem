package org.example;

import org.example.Model.GradeLevel;
import org.example.Model.HeadMaster;
import org.example.Model.Student;
import org.example.Model.Subject;
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
    private HeadMasterDaoImpl headMasterDaoImpl = new HeadMasterDaoImpl();
    private Student student1;

    @Before
    public void setUp() throws Exception {
        student1 = new Student(1, "Omar", LocalDate.parse("2007-01-27"),"Storgatan 32",0731011010,new GradeLevel(5, "Grade 5"));
    }

    @Test
    public void testToString() throws Exception {
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
    public void addStudent() throws Exception {
        assertEquals(student1, headMasterDaoImpl.addStudent(student1));
    }
}
