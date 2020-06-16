package org.example;

import org.example.Model.Subject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SubjectTest {
    private List<Subject> subjectList = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        subjectList = new ArrayList<Subject>();
        subjectList.add(new Subject(1,"Math"));
        subjectList.add(new Subject(2,"Swedish"));
        subjectList.add(new Subject(3,"English"));
        subjectList.add(new Subject(4,"French"));
    }

    @After
    public void tearDown() throws Exception {
        subjectList.clear();
    }

    @Test
    public void testToString() throws Exception {
        for (Subject subject : subjectList) {
            assertEquals(subject.toString(), "Subject{subjectId="+subject.getSubjectId()+"," + " subjectName="+ "'"+subject.getSubjectName()+"'}");
        }
    }
}
