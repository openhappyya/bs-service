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
public class Duty implements Serializable {

    private static final long serialVersionUID = 1L;
    private String guid;
    private String startHourTime;
    private String endHourTime;
    private Integer stuNumber;
    private String stuName;
    private String stuId;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
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

    public Integer getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(Integer stuNumber) {
        this.stuNumber = stuNumber;
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

    @Override
    public String toString() {
        return "Duty{" +
        ", guid = " + guid +
        ", startHourTime = " + startHourTime +
        ", endHourTime = " + endHourTime +
        ", stuNumber = " + stuNumber +
        ", stuName = " + stuName +
        ", stuId = " + stuId +
        "}";
    }
}
