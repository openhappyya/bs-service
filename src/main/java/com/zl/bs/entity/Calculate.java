package com.zl.bs.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zl
 * @since 2023-04-11
 */
public class Calculate implements Serializable {

    private static final long serialVersionUID = 1L;
    private String stuName;
    private String stuId;
    private Integer workHours;
    private Integer late;
    private Integer early;
    private String startTime;
    private String endTime;
    private String calTime;
    private String time;
    private Byte manuOrAuto;
    private Byte review;

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

    public Integer getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Integer workHours) {
        this.workHours = workHours;
    }

    public Integer getLate() {
        return late;
    }

    public void setLate(Integer late) {
        this.late = late;
    }

    public Integer getEarly() {
        return early;
    }

    public void setEarly(Integer early) {
        this.early = early;
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

    public String getCalTime() {
        return calTime;
    }

    public void setCalTime(String calTime) {
        this.calTime = calTime;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Byte getManuOrAuto() {
        return manuOrAuto;
    }

    public void setManuOrAuto(Byte manuOrAuto) {
        this.manuOrAuto = manuOrAuto;
    }

    public Byte getReview() {
        return review;
    }

    public void setReview(Byte review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Calculate{" +
        ", stuName = " + stuName +
        ", stuId = " + stuId +
        ", workHours = " + workHours +
        ", late = " + late +
        ", early = " + early +
        ", startTime = " + startTime +
        ", endTime = " + endTime +
        ", calTime = " + calTime +
        ", time = " + time +
        ", manuOrAuto = " + manuOrAuto +
        ", review = " + review +
        "}";
    }
}
