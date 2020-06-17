package org.example;

import org.example.Model.GradeLevel;
import org.example.Model.Student;
import org.example.Model.Subject;
import org.example.data_access.StudentDaoImpl;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StudentTest {
    private List<Student> studentList = new ArrayList<>();
    private List<Subject> subjectList = new ArrayList<>();
    StudentDaoImpl studentDao = new StudentDaoImpl();
    GradeLevel gradeLevel = new GradeLevel(5, "Grade 5", subjectList);
    private Student student1 = new Student("1","Omar Ali", LocalDate.parse("2007-01-27"),"Storgatan 32",0731011010,new GradeLevel(5, "Grade 5", subjectList));
    private Student student2 = new Student("2", "Ahmed Ali", LocalDate.parse("2006-06-16"),"parkgatan 32",0732022020,new GradeLevel(3, "Grade 3", subjectList));

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testToStrings() throws Exception {
        for (Student student : studentList) {
            assertEquals(student.toString(), "Student{id="+student.getStudentId()+","
                    + " fullName="+ "'"+student.getFullName()+"',"
                    + " birthDate="+ ""+student.getBirthDate()+","
                    + " address="+ "'"+student.getAddress()+"',"
                    + " careGiverContactNumber="+ ""+student.getCareGiverContactNumber()+"}");

        }
    }

    @Test
    public void testToString() throws Exception {

        assertEquals("1", student1.getStudentId());
        assertEquals("Omar Ali", student1.getFullName());
        assertEquals(LocalDate.parse("2007-01-27"), student1.getBirthDate());
        assertEquals("Storgatan 32", student1.getAddress());
        assertEquals(0731011010, student1.getCareGiverContactNumber());
    }

    @Test
    public void studentId() throws Exception {

    }

    @Test
    public void studentFullName() throws Exception {

    }

    @Test
    public void birthDate() throws Exception {

    }

    @Test
    public void address() throws Exception {

    }

    @Test
    public void careGiverContactNumber() throws Exception {

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
