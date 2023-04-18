package com.zl.bs.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zl
 * @since 2023-04-16
 */
public class Willness implements Serializable {

    private static final long serialVersionUID = 1L;
    private String guid;
    private String stuName;
    private String stuId;
    private String week;
    private String startHourTime;
    private String endHourTime;
    private Object workHours;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
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

    public Object getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Object workHours) {
        this.workHours = workHours;
    }

    @Override
    public String toString() {
        return "Willness{" +
        ", guid = " + guid +
        ", stuName = " + stuName +
        ", stuId = " + stuId +
        ", week = " + week +
        ", startHourTime = " + startHourTime +
        ", endHourTime = " + endHourTime +
        ", workHours = " + workHours +
        "}";
    }
}
