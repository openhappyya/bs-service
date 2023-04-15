package com.zl.bs.entity;

import java.util.Date;

public class workList {
    private String CategoryColor;
    private String EndTime;
    private String StartTime;
    private String Guid;
    private int ID;
    private String Location;
    private int PeopleNumber;
    private String Subject;

    public String getCategoryColor() {
        return CategoryColor;
    }

    public void setCategoryColor(String categoryColor) {
        CategoryColor = categoryColor;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getGuid() {
        return Guid;
    }

    public void setGuid(String guid) {
        Guid = guid;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getPeopleNumber() {
        return PeopleNumber;
    }

    public void setPeopleNumber(int peopleNumber) {
        PeopleNumber = peopleNumber;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }
}
