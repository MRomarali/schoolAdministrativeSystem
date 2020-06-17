package org.example;

import com.google.common.collect.HashMultimap;
import org.example.Model.Classes;
import org.example.Model.Group;
import org.example.Model.Student;
import org.example.Model.Subject;
import org.example.data_access.GroupDaoImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class app {
    public static List<GroupDaoImpl> existingGroups = new ArrayList<>(); //Contains all groups available.
    public static HashMultimap<Subject, Student> unplacedStudentsBySubject = HashMultimap.create(); //A data-structure enabling a Key to point to multiple values
    public static HashMap<Student, Classes> schoolClassByStudent = new HashMap(); //To make it easier to find the class of a student without having to declare a whole field in Student, thereby interconnecting the two classes




    public static void showUnplacedStudents() {
        unplacedStudentsBySubject.entries().iterator().forEachRemaining(subjectStudentEntry ->
        {
            System.out.println("Student " + subjectStudentEntry.getValue().getFullName() +
                    " with the id" + subjectStudentEntry.getValue().getStudentId() + " belonging to the class " + schoolClassByStudent.get(subjectStudentEntry.getValue()).getClassesId()
                    + ", is unplaced for the subject " + subjectStudentEntry.getKey().getSubjectName() + " with the id " + subjectStudentEntry.getKey().getSubjectId());
        });
    }
}
