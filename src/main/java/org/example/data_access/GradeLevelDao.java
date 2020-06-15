package org.example.data_access;

import org.example.Model.Classes;
import org.example.Model.GradeLevel;
import org.example.Model.Subject;

import java.util.List;

public interface GradeLevelDao {
    GradeLevel saveGrade(GradeLevel gradeLevel);
    GradeLevel findById(int Id);
    List<GradeLevel> findByName(String name);
    List<GradeLevel>findAll();
    int getTotalSubjects();
    void addCommonSubjects(Subject commonSubject);
    void addIndividualSubject(Subject individualSubjectChoice);
    boolean removeGradeLevel(GradeLevel gradeLevel);
}
