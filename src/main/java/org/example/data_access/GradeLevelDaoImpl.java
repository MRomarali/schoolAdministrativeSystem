package org.example.data_access;

import org.example.Model.GradeLevel;
import org.example.Model.Subject;

import java.util.List;

public class GradeLevelDaoImpl implements GradeLevelDao {
    private static List<GradeLevel> gradeLevels;
    private List<Subject> commonSubjectsList;
    private List<Subject> individualSubjectChoiceList;

    @Override
    public GradeLevel saveGrade(GradeLevel gradeLevel) {
        if (gradeLevels.contains(gradeLevel)) {
            gradeLevels.add(gradeLevel);
            System.out.println(gradeLevel.getGrade() + "Added!");
            return gradeLevel;
        }
        return null;
    }

    @Override
    public GradeLevel findById(int Id) {
        for (GradeLevel level: gradeLevels) {
            if (level.getGradeId() == Id) {
                return level;
            }
        }
        return null;
    }

    @Override
    public List<GradeLevel> findByName(String name) {
        for (GradeLevel level: gradeLevels) {
            if (level.getGrade().equalsIgnoreCase(name)) {
                return gradeLevels;
            }
        }
        return null;
    }

    @Override
    public List<GradeLevel> findAll() {
        for (GradeLevel level: gradeLevels) {
            return gradeLevels;
        }
        return null;
    }

    @Override
    public int getTotalSubjects() {
        return commonSubjectsList.size() + individualSubjectChoiceList.size();
    }

    @Override
    public void addCommonSubjects(Subject commonSubject) {
        if (!this.commonSubjectsList.contains(commonSubject)) {
            this.commonSubjectsList.add(commonSubject);
        }
    }

    @Override
    public void addIndividualSubject(Subject individualSubjectChoice) {
        if (!this.individualSubjectChoiceList.contains(individualSubjectChoice)) {
            this.individualSubjectChoiceList.add(individualSubjectChoice);
        }
    }

    @Override
    public boolean removeGradeLevel(GradeLevel gradeLevel) {
        for (GradeLevel deleteGrade: gradeLevels) {
            if (deleteGrade.getGrade().equals(gradeLevel)) {
                gradeLevels.remove(deleteGrade);
                System.out.println(gradeLevel.getGrade() + "Deleted!");
            }
            return true;
        }
        return false;
    }
}
