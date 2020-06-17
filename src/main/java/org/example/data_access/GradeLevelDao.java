package org.example.data_access;

import org.example.Model.Classes;
import org.example.Model.GradeLevel;
import org.example.Model.Subject;

import java.util.List;

public interface GradeLevelDao {
    void createGradeLevel(int gradeId, String grade, List<Subject> gradeLevelSubjects);

    GradeLevel findByName(String name);
    GradeLevel findById(int id);
    List<GradeLevel> findAll();
    Subject addCommonSubjects(Subject commonSubject);
    Subject addIndividualSubject(Subject individualSubjectChoice);
}
