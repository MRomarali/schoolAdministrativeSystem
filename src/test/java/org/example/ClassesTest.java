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
    private GradeLevel gradeLevel;

    private Classes classes = new Classes(1,"Math");
    private Student student1 = new Student(1, "Omar Ali", LocalDate.parse("2008-01-27"),"Storgatan 32",0731011010,new GradeLevel(5, "Grade 5"));
    private Student student2 = new Student(2, "Ahmed Ali", LocalDate.parse("2006-06-16"),"parkgatan 32",0732022020,new GradeLevel(3, "Grade 3"));
    private ClassDaoImpl classDao = new ClassDaoImpl();
    private StudentDaoImpl studentDao = new StudentDaoImpl();

    @Before
    public void setUp() throws Exception{
        student1 = new Student(1, "Omar Ali", LocalDate.parse("2008-01-27"),"Storgatan 32",0731011010,new GradeLevel(5, "Grade 5"));
        student2 = new Student(2, "Ahmed Ali", LocalDate.parse("2006-06-16"),"parkgatan 32",0732022020,new GradeLevel(3, "Grade 3"));
        classDao.register(student1);
        classDao.register(student2);

    }

    @Test
    public void registerStudent() throws Exception {

        assertEquals(classDao.totalNumberOfStudents(), 2);
        assertEquals(classDao.studentsExists(student1), true);
        assertEquals(classDao.studentsExists(student2), true);
    }

    @Test
    public void unplaceStudent() throws Exception {
        classDao.unplaceStudent(student2);
        assertEquals(classDao.totalNumberOfStudents(), 1);
        assertEquals(classDao.studentsExists(student2), false);
    }
}
