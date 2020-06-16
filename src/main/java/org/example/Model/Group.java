package org.example.Model;

public class Group {
    private int groupId;
    private String groupName;
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

    public String getGroupName() {
        return groupName;
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
