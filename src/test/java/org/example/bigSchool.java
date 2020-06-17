package org.example;

import org.example.Model.Classes;
import org.example.Model.GradeLevel;
import org.example.Model.Group;
import org.junit.Assert;
import org.junit.Test;

public class bigSchool extends TestEssentials {

    @Test
    public void initializeData() {


        //Creates Grade levels
        /*GradeLevel ninthGrade = new GradeLevel();
        ninthGrade.setGradeLevel("Ninth grade");
        ninthGrade.setMandatorySubjects(ninthGradeMandatorySubjects);
        ninthGrade.addMandatorysubject(chemistry);
        gradeLevels.add(ninthGrade);

        //Creates school classes with an automatically generated student list
        Classes ninthGradeFirstClass = new Classes("9a2020c", this.studentGeneratorForTesting(18, ninthGrade));
        Classes ninthGradeSecondClass = new Classes("9b2020c", this.studentGeneratorForTesting(13, ninthGrade));
        availableClasses.add(ninthGradeFirstClass);
        availableClasses.add(ninthGradeSecondClass);

        //First group for physics and maths
        Group gr = new Group("PhysAndMathGroup1b2020a5856", ninthGrade, 20, 0);
        gr.addSubjectTaught(maths);
        gr.addSubjectTaught(Physics);
        gr.addClass(ninthGradeFirstClass);
        gr.addClass(ninthGradeSecondClass);

        //Second group for physics and maths. Alternative construction.
        Group gr2 = new Group();
        gr2.setGradeLevel(ninthGrade);
        gr2.setGroupId("PhysGroup1c2020a5857");
        gr2.setMaxNumberOfStudents(11);
        gr2.setMinimumNumberOfStudents(0);
        gr2.addSubjectTaught(Physics);
        gr2.addClass(ninthGradeFirstClass);
        gr2.addClass(ninthGradeSecondClass);

        groups.add(gr);
        groups.add(gr2);

        ApplicationEntry.existingGroups.addAll(groups);
        ApplicationEntry.populateGroupsWithStudents(ninthGradeFirstClass.getStudentsOfClass());
        ApplicationEntry.populateGroupsWithStudents(ninthGradeSecondClass.getStudentsOfClass());
        Assert.assertEquals(11, ApplicationEntry.unplacedStudentsBySubject.get(maths).size());
        Assert.assertEquals(31, ApplicationEntry.unplacedStudentsBySubject.get(History).size()); //No group for the subject of History exists.
        Assert.assertEquals(0, ApplicationEntry.unplacedStudentsBySubject.get(Physics).size());

        ApplicationEntry.showUnplacedStudents();*/

    }

}
