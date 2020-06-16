package org.example.Model;

import java.time.LocalDate;
import java.util.Date;

public class Student {
    private int studentId;
    private String fullName;
    private LocalDate birthDate;
    private String address;
    private int careGiverContactNumber;
    private GradeLevel gradeLevel;

    public Student(int studentId, String fullName, LocalDate birthDate, String address, int careGiverContactNumber, GradeLevel gradeLevel) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.address = address;
        this.careGiverContactNumber = careGiverContactNumber;
        this.gradeLevel = gradeLevel;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCareGiverContactNumber() {
        return careGiverContactNumber;
    }

    public void setCareGiverContactNumber(int careGiverContactNumber) {
        this.careGiverContactNumber = careGiverContactNumber;
    }

    public GradeLevel getGradeLevel() {
        return gradeLevel;
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
