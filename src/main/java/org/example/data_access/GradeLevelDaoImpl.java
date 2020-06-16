package org.example.data_access;

import org.example.Model.GradeLevel;
import org.example.Model.Subject;

import java.util.ArrayList;
import java.util.List;

public class GradeLevelDaoImpl implements GradeLevelDao {
    private static List<GradeLevel> gradeLevels = new ArrayList<>();
    private static List<Subject> commonSubjectsList = new ArrayList<>();
    private static List<Subject> individualSubjectChoiceList = new ArrayList<>();

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
