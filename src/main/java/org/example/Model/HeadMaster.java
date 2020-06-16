package org.example.Model;

import java.util.List;

public class HeadMaster {
    private int headMasterId;
    private String headMasterName;
    private List<Student> studentList;

    public HeadMaster(int headMasterId, String headMasterName) {
        this.headMasterId = headMasterId;
        this.headMasterName = headMasterName;
        this.studentList = studentList;
    }

    public int getHeadMasterId() {
        return headMasterId;
    }

    public void setHeadMasterId(int headMasterId) {
        this.headMasterId = headMasterId;
    }

    public String getHeadMasterName() {
        return headMasterName;
    }

    public void setHeadMasterName(String headMasterName) {
        this.headMasterName = headMasterName;
    }

    public int totalNumberStudent(){
        return studentList.size();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HeadMaster{");
        sb.append("headMasterId=").append(headMasterId);
        sb.append(", headMasterName='").append(headMasterName).append('\'');
        sb.append(", studentList=").append(studentList);
        sb.append('}');
        return sb.toString();
    }
}
