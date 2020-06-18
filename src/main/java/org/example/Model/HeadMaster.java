package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class HeadMaster {
    private List<HeadMaster> headMasterList = new ArrayList<>();
    private int headMasterId;
    private String headMasterName;

    public HeadMaster(int headMasterId, String headMasterName) {
        this.headMasterId = headMasterId;
        this.headMasterName = headMasterName;
    }

    public int getHeadMasterId() {
        return headMasterId;
    }

    public String getHeadMasterName() {
        return headMasterName;
    }

    public List<HeadMaster> getHeadmaster() {
        return headMasterList;
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
