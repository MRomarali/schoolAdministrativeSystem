package org.example;

import org.example.Model.GradeLevel;
import org.example.Model.Student;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    private Student student;
    private LocalDate birthDate;

    @Before
    public void setUp() throws Exception {
        student = new Student(1, "Omar", birthDate.parse("2007-01-27"),"Storgatan 32",0731011010,new GradeLevel(5, "Grade 5"));
}

    @Test
    public void testToString() throws Exception {

        assertEquals(1, student.getStudentId());
        assertEquals("Omar", student.getFullName());
    }
}
