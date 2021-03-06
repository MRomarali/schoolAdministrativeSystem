package org.example;

import org.example.Model.Classes;
import org.example.Model.GradeLevel;
import org.example.Model.Student;
import org.example.Model.Subject;
import org.example.data_access.ClassDaoImpl;
import org.example.data_access.GroupDaoImpl;
import org.example.data_access.StudentDaoImpl;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ClassesTest {
    private List<Classes> classesList = new ArrayList<>();
    private ClassDaoImpl classDao = new ClassDaoImpl();
    private List<Student> studentList = new ArrayList<>();
    private List<Subject> subjectList = new ArrayList<>();
    private Classes classes = new Classes(1,"A", studentList);
    private Student student1 = new Student(1, "Omar Ali", LocalDate.parse("2008-01-27"),"Storgatan 32",0731011010,new GradeLevel(5, "Grade 5", subjectList));
    private Student student2 = new Student(2, "Ahmed Ali", LocalDate.parse("2006-06-16"),"parkgatan 32",0732022020,new GradeLevel(3, "Grade 3", subjectList));
    private GroupDaoImpl groupDaoImpl = new GroupDaoImpl();
    @Before
    public void setUp() throws Exception{
    }

    @Test
    public void createClasses() throws Exception{
        classDao.createClasses(1, "A", studentList);
        classDao.addClasses(1,classes);
        assertEquals(classDao.findById(1).getClasses().size(),1);

    }

    @Test
    public void findByName() throws Exception{
        classDao.createClasses(1, "A", studentList);
        classDao.addClasses(1,classes);
        assertEquals("A",classDao.findByName("A").getClassesName());

    }


    @Test
    public void testToString() throws Exception {
        classesList = new ArrayList<Classes>();
        classesList.add(new Classes(1, "1A", studentList));

        for (Classes classes : classesList) {
            assertEquals(classes.toString(), "Classes{classesId="+classes.getClassesId()+"," + " classesName="+ "'"+classes.getClassesName()+ "', students="+classes.getStudents()+"}");
        }
    }
    @Test
    public void testToStrings() throws Exception {

        assertEquals(1, classes.getClassesId());
        assertEquals("A", classes.getClassesName());
    }

    @Test
    public void classesId() throws Exception {
        classes = new Classes(1,"1A", studentList);
        assertEquals(1,classes.getClassesId());
    }

    @Test
    public void classesName() throws Exception {
        classes = new Classes(1,"1A", studentList);
        assertEquals("1A",classes.getClassesName());
    }

    @Test
    public void registerStudent() throws Exception {
        classDao.register(student1);
        classDao.register(student2);
        assertEquals(classDao.totalNumberOfStudents(), 2);
        assertEquals(classDao.studentsExists(student1), true);
        assertEquals(classDao.studentsExists(student2), true);
    }

    @Test
    public void unregisterStudent() throws Exception {
        classDao.unregister(student1);
        assertEquals(classDao.totalNumberOfStudents(), 2);
        assertEquals(classDao.studentsExists(student1), false);
    }

    @Test
    public void unplaceStudent() throws Exception {
        classDao.unplaceStudent(student2);
        assertEquals(classDao.totalNumberOfStudents(), 2);
        assertEquals(classDao.studentsExists(student2), false);
    }
}
