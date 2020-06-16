package org.example;

import org.example.Model.GradeLevel;
import org.example.Model.HeadMaster;
import org.example.Model.Student;
import org.example.data_access.HeadMasterDaoImpl;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class HeadMasterTest {
    public HeadMaster headmaster = new HeadMaster(1,"sam");
    private Student student1 = new Student(1, "Omar", LocalDate.parse("2008-01-27"),"Storgatan 32",0731011010,new GradeLevel(5, "Grade 5"));
    private Student student2 = new Student(2, "Ahmed", LocalDate.parse("2006-06-16"),"parkgatan 32",0732022020,new GradeLevel(3, "Grade 3"));
    private HeadMasterDaoImpl headMasterDaoImpl = new HeadMasterDaoImpl();

    @Before
    public void setUp() throws Exception {

        student1 = new Student(1, "Omar", LocalDate.parse("2007-01-27"),"Storgatan 32",0731011010,new GradeLevel(5, "Grade 5"));
        student2 = new Student(2, "Ahmed", LocalDate.parse("2007-01-27"),"Storgatan 23",0732022020,new GradeLevel(6, "Grade 6"));
        headMasterDaoImpl.addStudent(student1);
        headMasterDaoImpl.addStudent(student2);
    }

    @Test
    public void addStudent() throws Exception {

        assertEquals(headmaster.totalNumberStudent(), 2);
    }
}
