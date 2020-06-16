package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class HeadMaster {
    private int headMasterId;
    private String headMasterName;
    private List<Student> studentList;

    public HeadMaster(int headMasterId, String headMasterName) {
        this.headMasterId = headMasterId;
        this.headMasterName = headMasterName;
        this.studentList = studentList = new ArrayList<>();
    }

    public int getHeadMasterId() {
        return headMasterId;
    }

    public String getHeadMasterName() {
        return headMasterName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HeadMaster{");
        sb.append("headMasterId=").append(headMasterId);
        sb.append(", headMasterName='").append(headMasterName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
