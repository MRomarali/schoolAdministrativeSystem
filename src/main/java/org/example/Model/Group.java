package org.example.Model;

import org.example.data_access.GroupDaoImpl;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int groupId;
    private String groupName;
    private GroupDaoImpl groupDaoImpl;
    private int maxNumberOfStudents;
    private int minNumberOfStudents;


    public Group(int groupId, String groupName, int maxNumberOfStudents, int minNumberOfStudents) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.maxNumberOfStudents = maxNumberOfStudents;
        this.minNumberOfStudents = minNumberOfStudents;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public GroupDaoImpl getGroupDaoImpl() {
        return groupDaoImpl;
    }

    public void setGroupDaoImpl(GroupDaoImpl groupDaoImpl) {
        this.groupDaoImpl = groupDaoImpl;
    }

    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }

    public void setMaxNumberOfStudents(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public int getMinNumberOfStudents() {
        return minNumberOfStudents;
    }

    public void setMinNumberOfStudents(int minNumberOfStudents) {
        this.minNumberOfStudents = minNumberOfStudents;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Group{");
        sb.append("groupId=").append(groupId);
        sb.append(", groupName='").append(groupName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
