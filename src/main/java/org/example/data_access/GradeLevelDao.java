package org.example.data_access;

import org.example.Model.Subject;

public interface GradeLevelDao {
    Subject addCommonSubjects(Subject commonSubject);
    Subject addIndividualSubject(Subject individualSubjectChoice);
}
