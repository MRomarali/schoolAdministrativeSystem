package org.example;

import org.example.Model.GradeLevel;
import org.example.Model.HeadMaster;
import org.example.Model.Student;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class HeadMasterTest {
    public HeadMaster headmaster;
    private Student student1;
    private Student student2;
    private LocalDate birthDate;

    @Before
    public void setUp() throws Exception {

        headmaster = new HeadMaster(1, "Sam");
        student1 = new Student(1, "Omar", birthDate.parse("2007-01-27"),"Storgatan 32",0731011010,new GradeLevel(5, "Grade 5"));
        student2 = new Student(2, "Ahmed", birthDate.parse("2007-01-27"),"Storgatan 23",0732022020,new GradeLevel(6, "Grade 6"));
        headmaster.addStudent(student1);
        headmaster.addStudent(student2);
    }

    @Test
    public void addStudent() throws Exception {

        assertEquals(headmaster.totalNumberStudent(), 2);
    }
}
