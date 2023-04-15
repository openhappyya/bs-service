package com.zl.bs.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zl
 * @since 2023-04-15
 */
@TableName("work_roster")
public class Roster implements Serializable {

    private static final long serialVersionUID = 1L;
    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("CategoryColor")
    private String categoryColor;
    private String startTimeStr;
    private String endTimeStr;
    @JsonProperty("Location")
    private String location;
    @JsonProperty("PeopleNumber")
    private Integer stuNumber;
    private Object workHours;
    @JsonProperty("Guid")
    private String guid;
    @JsonProperty("StartTime")
    private String startTime;
    @JsonProperty("EndTime")
    private String endTime;
    private String startHourTime;
    private String endHourTime;
    @JsonProperty("Subject")
    private String subject;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryColor() {
        return categoryColor;
    }

    public void setCategoryColor(String categoryColor) {
        this.categoryColor = categoryColor;
    }

    public String getStartTimeStr() {
        return startTimeStr;
    }

    public void setStartTimeStr(String startTimeStr) {
        this.startTimeStr = startTimeStr;
    }

    public String getEndTimeStr() {
        return endTimeStr;
    }

    public void setEndTimeStr(String endTimeStr) {
        this.endTimeStr = endTimeStr;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(Integer stuNumber) {
        this.stuNumber = stuNumber;
    }

    public Object getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Object workHours) {
        this.workHours = workHours;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartHourTime() {
        return startHourTime;
    }

    public void setStartHourTime(String startHourTime) {
        this.startHourTime = startHourTime;
    }

    public String getEndHourTime() {
        return endHourTime;
    }

    public void setEndHourTime(String endHourTime) {
        this.endHourTime = endHourTime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Roster{" +
        ", Id = " + id +
        ", CategoryColor = " + categoryColor +
        ", startTimeStr = " + startTimeStr +
        ", endTimeStr = " + endTimeStr +
        ", Location = " + location +
        ", PeopleNumber = " + stuNumber +
        ", workHours = " + workHours +
        ", Guid = " + guid +
        ", StartTime = " + startTime +
        ", EndTime = " + endTime +
        ", startHourTime = " + startHourTime +
        ", endHourTime = " + endHourTime +
        ", Subject = " + subject +
        "}";
    }
}
