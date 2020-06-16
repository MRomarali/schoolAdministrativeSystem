package org.example;

import org.example.Model.GradeLevel;
import org.example.Model.Student;
import org.example.data_access.StudentDaoImpl;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StudentTest {
    StudentDaoImpl studentDao = new StudentDaoImpl();
    private Student student1 = new Student(1,"Omar Ali", LocalDate.parse("2007-01-27"),"Storgatan 32",0731011010,new GradeLevel(5, "Grade 5"));
    private Student student2 = new Student(2, "Ahmed Ali", LocalDate.parse("2006-06-16"),"parkgatan 32",0732022020,new GradeLevel(3, "Grade 3"));

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testToString() throws Exception {

        assertEquals(1, student1.getStudentId());
        assertEquals("Omar Ali", student1.getFullName());
    }


    @Test
    public void saveStudent() throws Exception {
        studentDao.saveStudent(student1);
        studentDao.saveStudent(student2);
        assertEquals(studentDao.totalNumberOfStudents(), 2 );
        assertEquals(studentDao.studentsExists(student2), true);
    }

    @Test
    public void deleteStudent() throws Exception {
        studentDao.saveStudent(student2);
        studentDao.deleteStudent(student2);
        assertFalse(studentDao.checksStudent(student2));
        assertEquals(studentDao.totalNumberOfStudents(), 0);
    }
}
