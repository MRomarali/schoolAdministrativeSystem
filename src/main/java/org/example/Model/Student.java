package org.example.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private int studentId;
    private String fullName;
    private LocalDate birthDate;
    private String address;
    private int careGiverContactNumber;
    private GradeLevel gradeLevel;
    private List<Subject> individuallyChosenSubjects = new ArrayList<>();
    private List<Student> studentList = new ArrayList<>();

    public Student(int studentId, String fullName, LocalDate birthDate, String address, int careGiverContactNumber, GradeLevel gradeLevel) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.address = address;
        this.careGiverContactNumber = careGiverContactNumber;
        this.gradeLevel = gradeLevel;
    }

    public List<Student> getStudent() {
        return studentList;
    }

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public int getCareGiverContactNumber() {
        return careGiverContactNumber;
    }

    public List<Subject> getIndividuallyChosenSubjects() {
        return individuallyChosenSubjects;
    }

    public void setIndividuallyChosenSubjects(List<Subject> individuallyChosenSubjects) {
        this.individuallyChosenSubjects = individuallyChosenSubjects;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCareGiverContactNumber(int careGiverContactNumber) {
        this.careGiverContactNumber = careGiverContactNumber;
    }

    public void setGradeLevel(GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(studentId);
        sb.append(", fullName='").append(fullName).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append(", address='").append(address).append('\'');
        sb.append(", careGiverContactNumber=").append(careGiverContactNumber);
        sb.append('}');
        return sb.toString();
    }
}
