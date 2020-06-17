package org.example.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private String studentId;
    private String fullName;
    private LocalDate birthDate;
    private String address;
    private int careGiverContactNumber;
    private GradeLevel gradeLevel;
    private List<Subject> individuallyChosenSubjects = new ArrayList<>();

    public Student(String studentId, String fullName, LocalDate birthDate, String address, int careGiverContactNumber, GradeLevel gradeLevel) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.address = address;
        this.careGiverContactNumber = careGiverContactNumber;
        this.gradeLevel = gradeLevel;
    }

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public String getStudentId() {
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

    public void setStudentId(String studentId) {
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
