package com.zl.bs.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author zl
 * @since 2023-04-13
 */
@TableName("stu_tick")
public class Tick implements Serializable {

    private static final long serialVersionUID = 1L;
    private String stuName;
    private String stuId;
    private Integer late;
    private Integer early;
    private Date time;
    private Double workHours;
    private Integer tickTimes;
    private String timeString;

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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Double workHours) {
        this.workHours = workHours;
    }

    public Integer getTickTimes() {
        return tickTimes;
    }

    public void setTickTimes(Integer tickTimes) {
        this.tickTimes = tickTimes;
    }

    public String getTimeString() {
        return timeString;
    }

    public void setTimeString(String timeString) {
        this.timeString = timeString;
    }

    @Override
    public String toString() {
        return "Tick{" +
        ", stuName = " + stuName +
        ", stuId = " + stuId +
        ", late = " + late +
        ", early = " + early +
        ", time = " + time +
        ", workHours = " + workHours +
        ", tickTimes = " + tickTimes +
        ", timeString = " + timeString +
        "}";
    }
}
