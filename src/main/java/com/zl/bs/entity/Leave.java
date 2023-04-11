package com.zl.bs.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author zl
 * @since 2023-04-05
 */
public class Leave implements Serializable {

    private static final long serialVersionUID = 1L;
    private String oldStu;
    private String newStu;
    private Date time;
    private Integer workHours;
    private Byte state;

    public String getOldStu() {
        return oldStu;
    }

    public void setOldStu(String oldStu) {
        this.oldStu = oldStu;
    }

    public String getNewStu() {
        return newStu;
    }

    public void setNewStu(String newStu) {
        this.newStu = newStu;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Integer workHours) {
        this.workHours = workHours;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Leave{" +
        ", oldStu = " + oldStu +
        ", newStu = " + newStu +
        ", time = " + time +
        ", workHours = " + workHours +
        ", state = " + state +
        "}";
    }
}
