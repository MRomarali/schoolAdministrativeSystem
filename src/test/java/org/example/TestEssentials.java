package org.example;

import org.example.Model.*;

import java.time.LocalDate;
import java.util.*;

public class TestEssentials {
    /*List<GradeLevel> gradeLevels = new ArrayList<>();
    List<Classes> availableClasses = new ArrayList<>();
    List<Group> groups = new ArrayList<>();

    List<Subject> ninthGradeMandatorySubjects = new ArrayList<>();
    List<Subject> freeSubjects = new ArrayList<>();
    List<Subject> tenthGradeMandatorySubjects = new ArrayList<>();
    List<Subject> eleventhGradeMandatorySubjects = new ArrayList<>();


    Subject maths = new Subject(1, "Math1b2020");
    Subject Physics = new Subject(2, "Phys2b2020");
    Subject History = new Subject(3, "History1b2020");
    Subject maths2 = new Subject(4, "Math2b2020");
    Subject maths3 = new Subject(5, "Math3b2020");
    Subject History2 = new Subject(6, "HistoryByz2b2020");
    Subject Geography = new Subject(7, "Geography2b2020");
    Subject chemistry, chemistry2;

    public TestEssentials() {

        chemistry.setSubjectId(1);
        chemistry.setSubjectName("Chemistry I");

        chemistry2.setSubjectId(2);
        chemistry2.setSubjectName("Chemistry II");

        ninthGradeMandatorySubjects.add(maths);
        ninthGradeMandatorySubjects.add(Physics);
        ninthGradeMandatorySubjects.add(History);

        tenthGradeMandatorySubjects.add(maths2);
        tenthGradeMandatorySubjects.add(Geography);
        eleventhGradeMandatorySubjects.add(maths3);
        freeSubjects.add(History2);
        freeSubjects.add(chemistry2);


    }


    protected List<Student> studentGeneratorForTesting(int numOfStudents, GradeLevel gradeLevel) {
        List<Student> studentsOfClass = new ArrayList<>();
        List<String> studentNames = Arrays.asList(new String[]{"George", "Dimitra", "John", "Marcus", "Susan", "Henry", "Bill", "Don", "Takis", "Nick", "Dmitri", "Johan", "Magnus", "Towu", "Tova", "Nicky"});
        List<String> studentSurnames = Arrays.asList(new String[]{"Malandrakis", "Johnson", "Marcusson", "Susanson", "Henryson", "Johanson", "Magnusson", "Papadopoulos", "Albertsson", "Muller"});
        Date date = new Date();

        Student bestStudent = new Student("1", "Omar",LocalDate.parse("2013-01-27"), "Storgatan 12",071234567,new GradeLevel(1, "Grade 1")); //First construction
        bestStudent.setStudentId(UUID.randomUUID().toString());
        bestStudent.setFullName("George Malandrakis");
        bestStudent.setAddress("Domaregatan 10B");
        bestStudent.setBirthDate(LocalDate.parse("2013-01-27"));
        bestStudent.setGradeLevel(gradeLevel);
        studentsOfClass.add(bestStudent);

        for (int i = 0; i < numOfStudents - 1; i++) {
            String randomname = studentNames.get(new Random().nextInt(studentNames.size()));
            String randomsurname = studentSurnames.get(new Random().nextInt(studentSurnames.size()));
            String id = UUID.randomUUID().toString();
            studentsOfClass.add(new Student(id, randomname, LocalDate.parse("2009-01-01"), "Storgatan 32", 0733213030, gradeLevel));
        }

        return studentsOfClass;
    }*/

}
