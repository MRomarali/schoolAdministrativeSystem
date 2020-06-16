package org.example;

import org.example.Model.GradeLevel;
import org.example.Model.Group;
import org.example.Model.Student;
import org.example.Model.Subject;
import org.example.data_access.GroupDaoImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class GroupTest {
    private GroupDaoImpl groupDao;
    private Group group1;
    private Subject subject1, subject2, subject3, subject4, subject5;
    private Student student1, student2, student3, student4, student5, student6, student7;
    private LocalDate birthDate;

    @Before
    public void setUp() throws Exception {

        group1 = new Group(1, "group1", 2,6);
        subject1 = new Subject(1, "Math");
        subject2 = new Subject(2, "Swedish");
        subject3 = new Subject(3, "English");
        subject4 = new Subject(4, "French");
        subject5 = new Subject(5, "Hindi");

        student1 = new Student(1, "Omar",birthDate.parse("2013-01-27"), "Storgatan 12",071234567,new GradeLevel(1, "Grade 1"));
        student2 = new Student(2, "Yasmin",birthDate.parse("2012-01-27"), "Storgatan 13",071234567,new GradeLevel(2, "Grade 2"));
        student3 = new Student(3, "Ahmed",birthDate.parse("2011-01-27"), "Storgatan 14",071234567,new GradeLevel(3, "Grade 3"));
        student4 = new Student(4, "Rahma",birthDate.parse("2010-01-27"), "Storgatan 15",071234567,new GradeLevel(4, "Grade 4"));
        student5 = new Student(5, "Kowsar",birthDate.parse("2009-01-27"), "Storgatan 16",071234567,new GradeLevel(5, "Grade 5"));
        student6 = new Student(6, "Abdullahi",birthDate.parse("2008-01-27"), "Storgatan 17",071234567,new GradeLevel(6, "Grade 6"));
        student7 = new Student(7, "Abdirahman",birthDate.parse("2007-01-27"), "Storgatan 18",071234567,new GradeLevel(7, "Grade 7"));

        groupDao.addSubject(subject1);
        groupDao.addSubject(subject2);
        groupDao.addSubject(subject3);
        groupDao.addSubject(subject4);
        groupDao.addSubject(subject5);

        groupDao.addStudentToGroup(student1);
        groupDao.addStudentToGroup(student2);
        groupDao.addStudentToGroup(student3);
        groupDao.addStudentToGroup(student4);
        groupDao.addStudentToGroup(student5);
        groupDao.addStudentToGroup(student6);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addSubject() throws Exception {

        assertEquals(groupDao.totalNumberOfSubjects(), 5);
    }

    @Test
    public void removeSubject() throws Exception {

        groupDao.removeSubject(subject1);
        assertFalse(groupDao.checksSubject(subject1));
        assertEquals(groupDao.totalNumberOfSubjects(), 4);
    }

    @Test
    public void addStudent() throws Exception {

        assertFalse(groupDao.addStudentToGroup(student7));
        assertEquals(groupDao.totalNumberOfStudents(), 6);
    }

    @Test
    public void removeStudent() throws Exception {

        groupDao.unplaceStudent(student5);
        System.out.print("The above one is from RemoveStudent TestCase"); //For convenient logging
        assertFalse(groupDao.checksStudent(student5));
        assertEquals(groupDao.totalNumberOfStudents(), 5);
    }

    @Test
    public void unplaceStudents() throws Exception {
        groupDao.unplaceStudent(student1);
        groupDao.unplaceStudent(student2);
        groupDao.unplaceStudent(student3);
        groupDao.unplaceStudent(student4);
        groupDao.unplaceStudent(student5);
        assertEquals(groupDao.totalNumberOfStudents(), 1);
        List<Student> unplaced = groupDao.unplaceStudentsFromGroup(group1);
        assertEquals(unplaced.size(), 1);
        assertEquals(unplaced.get(0).getStudentId(), 6);
        assertEquals(groupDao.totalNumberOfStudents(), 0);
    }
}
