package org.example;

import org.example.Model.Subject;
import org.example.data_access.SubjectDaoImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SubjectTest {
    private List<Subject> subjectList = new ArrayList<>();
    private SubjectDaoImpl subjectDao = new SubjectDaoImpl();
    private Subject subject1 = new Subject(1,"Math");
    private Subject subject2 = new Subject(2,"Swedish");

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testToString() throws Exception {
        for (Subject subject : subjectList) {
            assertEquals(subject.toString(), "Subject{subjectId="+subject.getSubjectId()+"," + " subjectName="+ "'"+subject.getSubjectName()+"'}");

        }
    }

    @Test
    public void subjectId() throws Exception {

    }

    @Test
    public void subjectName() throws Exception {

    }

    @Test
    public void saveSubject() throws Exception {
        subjectDao.saveSubject(subject1);
        subjectDao.saveSubject(subject2);
        assertEquals(subjectDao.totalNumberOfStudents(), 2 );
        assertEquals(subjectDao.subjectsExists(subject1), true);
    }

    @Test
    public void removeSubject() throws Exception {
        subjectDao.removeSubject(subject1);
        assertEquals(subjectDao.totalNumberOfStudents(), 2);
        assertEquals(subjectDao.subjectsExists(subject1), false);
    }
}
