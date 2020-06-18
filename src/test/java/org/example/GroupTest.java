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
    private Subject subject1, subject2;
    private Student student1, student2, student3, student4, student5, student6, student7;



    @Test
    public void groupId() throws Exception {
        sva = new Group(1,"Swedish 2", gradeLevel,6,2);
        assertEquals(1,sva.getGroupId());
    }

    @Test
    public void groupName() throws Exception {
        sva = new Group(1,"Swedish 2", gradeLevel,6,2);
        assertEquals("Swedish 2",sva.getGroupName());
    }

    @Test
    public void groupLevel() throws Exception{
        sva = new Group(1,"Swedish 2", gradeLevel,6,2);
        assertEquals(gradeLevel,sva.getGradeLevel());

    }

    @Test
    public void addSubject() throws Exception {
        groupDaoImpl.addSubject(subject1);
        groupDaoImpl.addSubject(subject2);
        assertEquals(groupDaoImpl.totalNumberOfSubjects(), 2);
    }

    @Test
    public void removeSubject() throws Exception {
        subject1 = new Subject(1, "Math");
        subject2 = new Subject(1, "Math");
        groupDaoImpl.addSubject(subject1);
        groupDaoImpl.addSubject(subject2);
        groupDaoImpl.removeSubject(subject1);
        assertFalse(groupDaoImpl.checksSubject(subject1));
        assertEquals(1,groupDaoImpl.totalNumberOfSubjects());
    }

    @Test
    public void removeStudent() throws Exception {
        student1 = new Student(1, "Omar",LocalDate.parse("2013-01-27"), "Storgatan 12",071234567,new GradeLevel(1,"Grade 1", subjectList));
        student2 = new Student(2, "Omar",LocalDate.parse("2013-01-27"), "Storgatan 12",071234567,new GradeLevel(1,"Grade 1", subjectList));
        groupDaoImpl.addStudent(student1);
        groupDaoImpl.addStudent(student2);
        groupDaoImpl.removeStudent(student1);
        assertFalse(groupDaoImpl.checksStudent(student1));
        assertEquals(1,groupDaoImpl.totalNumberOfStudents());
    }

    @Test
    public void addStudentToGroupSucess() {
        assertEquals(groupDaoImpl.findById(1).getStudents().size(),1);
    }

    @Test
    public void findByName() throws Exception{
        groupDaoImpl.createGroup(1, "A", gradeLevel, 5,2);
        groupDaoImpl.addStudentToGroup(1,student1);
        assertEquals("A",groupDaoImpl.findByName("A").getGroupName());

    }


    @Test
    public void unplaceStudents() throws Exception {
        student1 = new Student(1, "Omar",LocalDate.parse("2013-01-27"), "Storgatan 12",071234567,new GradeLevel(1,"Grade 1", subjectList));
        student2 = new Student(2, "Yasmin",LocalDate.parse("2012-01-27"), "Storgatan 13",071234567,new GradeLevel(2, "Grade 2", subjectList));
        student3 = new Student(3, "Ahmed",LocalDate.parse("2011-01-27"), "Storgatan 14",071234567,new GradeLevel(3, "Grade 3", subjectList));

        groupDaoImpl.addStudent(student1);
        groupDaoImpl.addStudent(student2);
        groupDaoImpl.addStudent(student3);
        groupDaoImpl.unplaceStudent(student2);

        assertEquals(groupDaoImpl.totalNumberOfStudents(), 2);
    }

    @Test
    public void testToString() throws Exception {
        groupList = new ArrayList<Group>();
        groupList.add(new Group(1,"Swedish 2", gradeLevel,6,2));

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
