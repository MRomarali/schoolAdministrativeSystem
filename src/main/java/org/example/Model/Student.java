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
