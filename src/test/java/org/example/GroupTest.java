package org.example;

import org.example.Model.GradeLevel;
import org.example.Model.Group;
import org.example.Model.Student;
import org.example.Model.Subject;
import org.example.data_access.GroupDaoImpl;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class GroupTest {
    private GroupDaoImpl groupDaoImpl = new GroupDaoImpl();
    private Group group1 = new Group(1,"Spanish", 6, 2);
    private Subject subject1, subject2, subject3, subject4, subject5;
    private Student student1, student2, student3, student4, student5, student6, student7;

    @Before
    public void setUp() throws Exception {

        group1 = new Group(1, "group1", 2,6);
        subject1 = new Subject(1, "Math");
        subject2 = new Subject(2, "Swedish");
        subject3 = new Subject(3, "English");
        subject4 = new Subject(4, "French");
        subject5 = new Subject(5, "Hindi");

        student1 = new Student(1, "Omar",LocalDate.parse("2013-01-27"), "Storgatan 12",071234567,new GradeLevel(1, "Grade 1"));
        student2 = new Student(2, "Yasmin",LocalDate.parse("2012-01-27"), "Storgatan 13",071234567,new GradeLevel(2, "Grade 2"));
        student3 = new Student(3, "Ahmed",LocalDate.parse("2011-01-27"), "Storgatan 14",071234567,new GradeLevel(3, "Grade 3"));
        student4 = new Student(4, "Rahma",LocalDate.parse("2010-01-27"), "Storgatan 15",071234567,new GradeLevel(4, "Grade 4"));
        student5 = new Student(5, "Kowsar",LocalDate.parse("2009-01-27"), "Storgatan 16",071234567,new GradeLevel(5, "Grade 5"));
        student6 = new Student(6, "Abdullahi",LocalDate.parse("2008-01-27"), "Storgatan 17",071234567,new GradeLevel(6, "Grade 6"));
        student7 = new Student(7, "Abdirahman",LocalDate.parse("2007-01-27"), "Storgatan 18",071234567,new GradeLevel(7, "Grade 7"));

        groupDaoImpl.addSubject(subject1);
        groupDaoImpl.addSubject(subject2);
        groupDaoImpl.addSubject(subject3);
        groupDaoImpl.addSubject(subject4);
        groupDaoImpl.addSubject(subject5);

        groupDaoImpl.addStudentToGroup(student1);
        groupDaoImpl.addStudentToGroup(student2);
        groupDaoImpl.addStudentToGroup(student3);
        groupDaoImpl.addStudentToGroup(student4);
        groupDaoImpl.addStudentToGroup(student5);
        groupDaoImpl.addStudentToGroup(student6);
    }
    @Test
    public void addSubject() throws Exception {
        assertEquals(groupDaoImpl.totalNumberOfSubjects(), 5);
    }

    @Test
    public void removeSubject() throws Exception {

        groupDaoImpl.removeSubject(subject1);
        assertFalse(groupDaoImpl.checksSubject(subject1));
        assertEquals(groupDaoImpl.totalNumberOfSubjects(), 4);
    }

    @Test
    public void removeStudent() throws Exception {

        groupDaoImpl.removeStudent(student1);
        assertFalse(groupDaoImpl.checksStudent(student1));
        assertEquals(groupDaoImpl.totalNumberOfSubjects(), 5);
    }

    @Test
    public void unplaceStudents() throws Exception {
        groupDaoImpl.addStudent(student1);
        groupDaoImpl.addStudent(student2);
        groupDaoImpl.addStudent(student3);
        groupDaoImpl.unplaceStudent(student2);

        assertEquals(groupDaoImpl.totalNumberOfStudents(), 2);
    }
}
