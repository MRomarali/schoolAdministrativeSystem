package org.example;

import org.example.Model.Classes;
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

    @Test
    public void createSubject() throws Exception{
        //subjectDao.createSubject(1, "Math");
        //subjectDao.addSubject(1,subject1);
        assertEquals(subjectDao.findById(1).getSubjects().size(),1);

    }

    @Test
    public void findByName() throws Exception{
        subjectDao.createSubject(1, "Math");
        subjectDao.addSubject(1,subject1);
        assertEquals("Math",subjectDao.findByName("Math").getSubjectName());

    }

    @Test
    public void testToString() throws Exception {
        subjectList = new ArrayList<Subject>();
        subjectList.add(new Subject(1, "Math"));

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
