package org.example;

import com.google.common.collect.HashMultimap;
import org.example.Model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{

    /*
    public static List<Group> existingGroups = new ArrayList<>(); //Contains all groups available.
    public static HashMultimap<Subject, Student> unplacedStudentsBySubject = HashMultimap.create(); //A data-structure enabling a Key to point to multiple values
    public static HashMap<Student, Classes> schoolClassByStudent = new HashMap(); //To make it easier to find the class of a student without having to declare a whole field in Student, thereby interconnecting the two classes

    public static void populationOfExistingGroupsWithStudents(List<Student> studentList) {
        List<Subject> subjects;
        List<Group> groupsBySubject;
        List<Group> filteredGroupsBySubject;

        for (Student currentStudent : studentList) { //For every student in the list
            subjects = new ArrayList<>();
            filteredGroupsBySubject = new ArrayList<>();

            subjects.addAll(currentStudent.getGradeLevel().getCommonSubjectsList()); //create a list of the subjects (s)he is supposed to study.
            if (currentStudent.getSpecifiedSubject() != null) {
                subjects.addAll(currentStudent.getSpecifiedSubject());
            }
            for (Subject currentSubject : subjects) { //For every subject of each student
                groupsBySubject = getGroupsBySubject(currentSubject); //find all the groups related to the subject.
                if (groupsBySubject.size() > 0) { //If there are any,

                    List<Group> finalFilteredGroupsBySubject = filteredGroupsBySubject;
                    groupsBySubject.iterator().forEachRemaining(group -> {
                        if (!(schoolClassByStudent.get(currentStudent) == null) && group.getClasses().contains(schoolClassByStudent.get(currentStudent))) {   //keep the ones that are created for the student's class
                            finalFilteredGroupsBySubject.add(group);
                        }
                    });
                    groupsBySubject = filteredGroupsBySubject;
                    groupsBySubjectLoop:
                    for (int i = 0; i < groupsBySubject.size(); i++) {
                        if (groupsBySubject.get(i).getGradeLevel().equals(currentStudent.getGradeLevel())) //If the group is intended to have students of the same grade
                        {
                            if (groupsBySubject.get(i).getStudents().contains(currentStudent) || groupsBySubject.get(i).addStudentToGroup(currentStudent)) { //Add the student to the group, if the group is not full and if (s)he is not already in it (e.g. in case of a multiple-subject group)
                                break groupsBySubjectLoop; //and proceed to the next subject
                            }
                        }
                        if (i == groupsBySubject.size() - 1) { //Mark the student as unplaced for the particular subject if the loop reaches its' end, and (s)he has not been added to one of the groups.
                            unplacedStudentsBySubject.put(currentSubject, currentStudent);
                        }
                    }
                } else {
                    unplacedStudentsBySubject.put(currentSubject, currentStudent); //if no group was available in the first place, the student is unplaced for the particular subject
                }
            }
        }

        existingGroups.iterator().forEachRemaining(group -> {
            if (!(group.isLessThan())) {
                System.out.println("The group " + group.getGroupId() + "does not have enough students. Consider adjusting group sizes and reallocating the students.");
                for (Subject sub : group.getSubjects()) {
                    for (Student st : group.getStudents()) {
                        unplacedStudentsBySubject.put(sub, st); //The students of the groups that do not exceed the minimum number of students are marked as unplaced for the subjects taught in it.
                    }
                }
            }
        });
    }
    public static List<Group> getGroupsBySubject(Subject subject) {
        List<Group> groups = new ArrayList<>();
        for (Group gr : existingGroups) {
            if (gr.getSubjects().contains(subject)) {
                groups.add(gr);
            }
        }
        return groups;
    }

    public static void showUnplacedStudents() {
        unplacedStudentsBySubject.entries().iterator().forEachRemaining(subjectStudentEntry ->
        {
            System.out.println("Student " + subjectStudentEntry.getValue().getFullName() +
                    " with the id" + subjectStudentEntry.getValue().getStudentId() + " belonging to the class " + schoolClassByStudent.get(subjectStudentEntry.getValue()).getClassesId()
                    + ", is unplaced for the subject " + subjectStudentEntry.getKey().getSubjectName() + " with the id " + subjectStudentEntry.getKey().getSubjectId());
        });

    }*/

}
