package org.example;

import org.example.Model.Classes;
import org.example.Model.GradeLevel;
import org.example.Model.Group;
import org.example.Model.Student;
import org.junit.Test;

import java.util.List;

public class smallSchool extends TestEssentials {

    @Test
    public void initializeAndRun() {

        /*GradeLevel tenthGrade = new GradeLevel(10, tenthGradeMandatorySubjects);
        gradeLevels.add(tenthGrade);

        GradeLevel eleventhGrade = new GradeLevel(11, eleventhGradeMandatorySubjects);
        gradeLevels.add(eleventhGrade);

        List<Student> tenthGradeStudents = this.studentGeneratorForTesting(11, tenthGrade);
        for (int i = 0; i < 5; i++) {
            tenthGradeStudents.get(i).addIndividuallyChosenSubject(chemistry2); //Only five students are interested in chemistry II
        }

        List<Student> eleventhGradeStudents = this.studentGeneratorForTesting(11, eleventhGrade);

        List<Student> tenthAndEleventhGradeStudents = eleventhGradeStudents;
        tenthAndEleventhGradeStudents.addAll(tenthGradeStudents);
        tenthAndEleventhGradeStudents.iterator().forEachRemaining(student -> {
            student.addIndividuallyChosenSubject(History2); //All students are interested in Byzantine history
        });

        Classes tenthAndEleventhGradeClass = new Classes(1, tenthAndEleventhGradeStudents, );
        availableClasses.add(tenthAndEleventhGradeClass);

        //Group for Byzantine history. .
        Group group3 = new Group();
        group3.setGradeLevel(tenthGrade);
        group3.setGroupId("ByzHist2020a5858");
        group3.setMaxNumberOfStudents(15);
        group3.setMinimumNumberOfStudents(0);
        group3.addSubjectTaught(History2);
        group3.addClass(tenthAndEleventhGradeClass);
        ApplicationEntry.existingGroups.add(group3);

        //Group for Chemistry. .
        Group group4 = new Group();
        group4.setGradeLevel(tenthGrade);
        group4.setGroupId("Chem2020a5858");
        group4.setMaxNumberOfStudents(80);
        group4.setMinimumNumberOfStudents(8); //The minimum number of students is less than the sum of the interested ones.
        group4.addSubjectTaught(chemistry2);
        group4.addClass(tenthAndEleventhGradeClass);
        ApplicationEntry.existingGroups.add(group4);

        ApplicationEntry.populateGroupsWithStudents(tenthAndEleventhGradeClass.getStudentsOfClass());

        Assert.assertTrue(ApplicationEntry.unplacedStudentsBySubject.get(freeSubjects.get(0)).size() == 11);

        ApplicationEntry.unplacedStudentsBySubject.get(freeSubjects.get(0)).iterator().forEachRemaining(student -> {
            Assert.assertTrue(student.getGradeLevel().equals(eleventhGrade)); //All unplaced students for Byzantine History should be of the eleventh grade.
        });

        Assert.assertEquals(5, ApplicationEntry.unplacedStudentsBySubject.get(chemistry2).size());

        ApplicationEntry.showUnplacedStudents();*/

    }

}
