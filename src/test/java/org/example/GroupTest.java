package org.example;

import org.example.Model.*;
import org.example.data_access.GroupDaoImpl;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class GroupTest {
    private List<Group> groupList = new ArrayList<>();
    private List<Subject> subjectList = new ArrayList<>();
    private GradeLevel gradeLevel = new GradeLevel(1,"1A", subjectList);
    private GroupDaoImpl groupDaoImpl = new GroupDaoImpl();
    private Group sva = new Group(1,"Swedish 2", gradeLevel,6,2);
    private Subject subject1, subject2, subject3, subject4, subject5;
    private Student student1, student2, student3, student4, student5, student6, student7;

    @Before
    public void setUp() throws Exception {

        sva = new Group(1,"Swedish 2", gradeLevel,6,2);
        subject1 = new Subject(1, "Math");
        subject2 = new Subject(2, "Swedish");
        subject3 = new Subject(3, "English");
        subject4 = new Subject(4, "French");
        subject5 = new Subject(5, "Hindi");

        student1 = new Student("1", "Omar",LocalDate.parse("2013-01-27"), "Storgatan 12",071234567,new GradeLevel(1,"Grade 1", subjectList));
        student2 = new Student("2", "Yasmin",LocalDate.parse("2012-01-27"), "Storgatan 13",071234567,new GradeLevel(2, "Grade 2", subjectList));
        student3 = new Student("3", "Ahmed",LocalDate.parse("2011-01-27"), "Storgatan 14",071234567,new GradeLevel(3, "Grade 3", subjectList));
        student4 = new Student("4", "Rahma",LocalDate.parse("2010-01-27"), "Storgatan 15",071234567,new GradeLevel(4, "Grade 4", subjectList));
        student5 = new Student("5", "Kowsar",LocalDate.parse("2009-01-27"), "Storgatan 16",071234567,new GradeLevel(5, "Grade 5", subjectList));
        student6 = new Student("6", "Abdullahi",LocalDate.parse("2008-01-27"), "Storgatan 17",071234567,new GradeLevel(6, "Grade 6", subjectList));
        student7 = new Student("7", "Abdirahman",LocalDate.parse("2007-01-27"), "Storgatan 18",071234567,new GradeLevel(7, "Grade 7",subjectList));

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

        groupList = new ArrayList<Group>();
        groupList.add(new Group(1,"Swedish 2", gradeLevel,6,2));
    }

    @Test
    public void groupId() throws Exception {

    }

    @Test
    public void groupName() throws Exception {

    }

    @Test
    public void groupLevel() throws Exception{

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
    public void getGroupsBySubject() throws Exception{

        //assertEquals(groupDaoImpl.getGroupsBySubject(subject1), 1);

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

    @Test
    public void testToString() throws Exception {
        for (Group group : groupList) {
            assertEquals(group.toString(), "Group{groupId="+group.getGroupId()+"," + " groupName="+ "'"+group.getGroupName()+"'}");
        }
    }
    @Test
    public void testToStrings() throws Exception {

        assertEquals(1, sva.getGroupId());
        assertEquals("Swedish 2", sva.getGroupName());
    }
}
