package com.zl.bs.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zl
 * @since 2023-04-14
 */
public class Calculate implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String stuId;
    private String stuName;
    private Object workHours;
    private Integer late;
    private Integer early;
    private String startTime;
    private String endTime;
    private String calTime;
    private String time;
    private Byte manuOrAuto;
    private Byte review;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Object getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Object workHours) {
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
        ", id = " + id +
        ", stuId = " + stuId +
        ", stuName = " + stuName +
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
