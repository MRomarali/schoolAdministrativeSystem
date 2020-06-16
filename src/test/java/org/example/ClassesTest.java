package org.example;

import org.example.Model.Classes;
import org.example.Model.GradeLevel;
import org.example.Model.Student;
import org.example.data_access.ClassDaoImpl;
import org.example.data_access.StudentDaoImpl;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class ClassesTest {

    private Classes classes;
    private Student student;
    private Student student1;
    private ClassDaoImpl classDao;
    private StudentDaoImpl studentDao;
    private LocalDate birthDate;

    @Before
    public void setUp() throws Exception{
        classes = new Classes(1, "1A");
        student = new Student(1, "Omar", birthDate.parse("2008-01-27"),"Storgatan 32",0731011010,new GradeLevel(5, "Grade 5"));
        student1 = new Student(2, "Ahmed", birthDate.parse("2006-06-16"),"parkgatan 32",0732022020,new GradeLevel(3, "Grade 3"));
        classDao.register(student);
        classDao.register(student1);

    }

    @Test
    public void registerStudent() throws Exception {

        assertEquals(classes.totalNumberOfStudents(), 2);
        assertEquals(classes.studentsExists(student), true);
        assertEquals(classes.studentsExists(student1), true);
    }

    @Test
    public void unplaceStudent() throws Exception {
        classDao.unplaceStudent(student1);
        assertEquals(classes.totalNumberOfStudents(), 1);
        assertEquals(classes.studentsExists(student1), false);
    }
}
