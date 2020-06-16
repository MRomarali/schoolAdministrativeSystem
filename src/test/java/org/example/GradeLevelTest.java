package org.example;

import org.example.Model.GradeLevel;
import org.example.Model.Subject;
import org.example.data_access.GradeLevelDao;
import org.example.data_access.GradeLevelDaoImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeLevelTest {
    private GradeLevel gradeLevel =  new GradeLevel(2, "Grade 5");
    private GradeLevelDaoImpl gradeLevelDaoImpl = new GradeLevelDaoImpl();


    @Before
    public void setUp() throws Exception {
        gradeLevelDaoImpl.addCommonSubjects(new Subject(1,"Math"));
        gradeLevelDaoImpl.addCommonSubjects(new Subject(2,"Swedish"));
        gradeLevelDaoImpl.addIndividualSubject(new Subject(3,"English"));
        gradeLevelDaoImpl.addIndividualSubject(new Subject(4,"French"));
        gradeLevelDaoImpl.addIndividualSubject(new Subject(5, "Spanish"));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addCommonSubject() throws Exception {
        assertEquals("Math", gradeLevel.getCommonSubjects().get(0).getSubjectName());
        assertEquals(2, gradeLevel.getCommonSubjects().get(1).getSubjectId());
    }

    @Test
    public void addIndividualChosenSubject() throws Exception {
        assertEquals("Math", gradeLevel.getIndividualChosenSubjects().get(0).getSubjectName());
        assertEquals("Swedish", gradeLevel.getIndividualChosenSubjects().get(1).getSubjectName());
        assertEquals("English", gradeLevel.getIndividualChosenSubjects().get(2).getSubjectId());
    }
}
