package org.example.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private int studentId;
    private String fullName;
    private Date birthDate;
    private String address;
    private int careGiverContactNumber;

    public Student(int studentId, String fullName, Date birthDate, String address, int careGiverContactNumber) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.address = address;
        this.careGiverContactNumber = careGiverContactNumber;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
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
