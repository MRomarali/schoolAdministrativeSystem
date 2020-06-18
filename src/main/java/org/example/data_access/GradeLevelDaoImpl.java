package org.example.data_access;

import org.example.Model.Classes;
import org.example.Model.GradeLevel;
import org.example.Model.HeadMaster;
import org.example.Model.Subject;

import java.util.ArrayList;
import java.util.List;

public class GradeLevelDaoImpl implements GradeLevelDao {
    private static List<GradeLevel> gradeLevels = new ArrayList<>();
    private static List<Subject> commonSubjectsList = new ArrayList<>();
    private static List<Subject> individualSubjectChoiceList = new ArrayList<>();

    @Override
    public void createGradeLevel(int gradeId, String grade, List<Subject> gradeLevelSubjects){
        GradeLevel gradeLevel = new GradeLevel(gradeId, grade, gradeLevelSubjects);
        gradeLevels.add(gradeLevel);
    }
    @Override
    public boolean addGradeLevel(int gradeId, String grade, List<Subject> gradeLevelSubjects){
        GradeLevel gradeLevel = findById(gradeId);
        List<GradeLevel> level = gradeLevel.getGradeLevel();
        level.add(gradeLevel);
        return true;
    }
    @Override
    public GradeLevel findByName(String name) {
        for (GradeLevel gradeLevel:gradeLevels) {
            if (gradeLevel.getGrade().equalsIgnoreCase(name)) {
                return gradeLevel;
            }
        }
        return null;
    }

    @Override
    public GradeLevel findById(int id) {
        for (GradeLevel gradeLevel:gradeLevels) {
            if (gradeLevel.getGradeId() == id) {
                return gradeLevel;
            }
        }
        return null;
    }

    @Override
    public List<GradeLevel> findAll() {
        for (GradeLevel gradeLevel:gradeLevels) {
            return gradeLevels;
        }
        return null;
    }

    @Override
    public Subject addCommonSubjects(Subject commonSubject) {
        if (!commonSubjectsList.contains(commonSubject)) {
            commonSubjectsList.add(commonSubject);
        }
        return commonSubject;
    }

    @Override
    public Subject addIndividualSubject(Subject individualSubjectChoice) {
        if (!this.individualSubjectChoiceList.contains(individualSubjectChoice)) {
            this.individualSubjectChoiceList.add(individualSubjectChoice);
        }
        return individualSubjectChoice;
    }
}
