package org.example;

import org.example.Model.GradeLevel;
import org.example.Model.Group;
import org.example.Model.Subject;
import org.example.data_access.GradeLevelDaoImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GradeLevelTest {
    private List<GradeLevel> gradeLevelList = new ArrayList<>();
    private GradeLevel gradeLevel = new GradeLevel(1,"Grade 1");
    private GradeLevelDaoImpl gradeLevelDaoImpl = new GradeLevelDaoImpl();
    private Subject subject1, subject2, subject3, subject4, subject5;

    @Before
    public void setUp() throws Exception {
        subject1 = new Subject(1,"Math");
        subject2 = new Subject(2,"Swedish");
        subject3 = new Subject(3,"English");
        subject4 = new Subject(4,"French");
        subject5 = new Subject(5, "Spanish");
    }


    @Test
    public void testToString() throws Exception {
        for (GradeLevel grList : gradeLevelList) {
            assertEquals(grList.toString(), "GradeLevel{GradeId="+grList.getGradeId()+"," + " grade="+ "'"+grList.getGrade()+"'}");
        }
    }
    @Test
    public void testToStrings() throws Exception {

        assertEquals(1, gradeLevel.getGradeId());
        assertEquals("Grade 1", gradeLevel.getGrade());
    }

    @Test
    public void addCommonSubject() throws Exception {
        assertEquals(subject1, gradeLevelDaoImpl.addCommonSubjects(subject1));
    }

    /*@Test
    public void getTotalSubjects() throws Exception {
        assertEquals(subject1, gradeLevelDaoImpl.getTotalSubjects());
    }*/

    @Test
    public void addIndividualChosenSubject() throws Exception {
        assertEquals(subject1, gradeLevelDaoImpl.addIndividualSubject(subject1));
        assertEquals(subject2, gradeLevelDaoImpl.addIndividualSubject(subject2));
        assertEquals(subject3, gradeLevelDaoImpl.addIndividualSubject(subject3));
        assertEquals(subject4, gradeLevelDaoImpl.addIndividualSubject(subject4));
        assertEquals(subject5, gradeLevelDaoImpl.addIndividualSubject(subject5));
    }
}
