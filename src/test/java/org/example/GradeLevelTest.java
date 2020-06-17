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
    private List<Subject> subjectList = new ArrayList<>();
    private GradeLevel gradeLevel = new GradeLevel(1,"Grade 1", subjectList);
    private GradeLevelDaoImpl gradeLevelDaoImpl = new GradeLevelDaoImpl();
    private Subject subject1, subject2, subject3, subject4, subject5;

    @Before
    public void setUp() throws Exception {
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
    public void gradeId() throws Exception {
        assertEquals(1, gradeLevelDaoImpl.findById(1).getGradeId());
    }

    @Test
    public void gradeName() throws Exception {
        assertEquals("Grade 1", gradeLevelDaoImpl.findByName("Grade 1"));
    }

    @Test
    public void addCommonSubject() throws Exception {
        assertEquals(subject1, gradeLevelDaoImpl.addCommonSubjects(subject1));
    }

    @Test
    public void addIndividualChosenSubject() throws Exception {
        assertEquals(subject1, gradeLevelDaoImpl.addIndividualSubject(subject1));
        assertEquals(subject2, gradeLevelDaoImpl.addIndividualSubject(subject2));
        assertEquals(subject3, gradeLevelDaoImpl.addIndividualSubject(subject3));
        assertEquals(subject4, gradeLevelDaoImpl.addIndividualSubject(subject4));
        assertEquals(subject5, gradeLevelDaoImpl.addIndividualSubject(subject5));
    }
}
