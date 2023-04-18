package com.zl.bs.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zl
 * @since 2023-04-14
 */
@TableName("leave_list")
public class List implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String oldStu;
    private String newStu;
    private String time;
    private Double workHours;
    private Byte state;
    private Byte needToApproved;
    private String oldStuId;
    private String newStuId;
    private Byte stuResponse;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Double workHours) {
        this.workHours = workHours;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getNeedToApproved() {
        return needToApproved;
    }

    public void setNeedToApproved(Byte needToApproved) {
        this.needToApproved = needToApproved;
    }

    public String getOldStuId() {
        return oldStuId;
    }

    public void setOldStuId(String oldStuId) {
        this.oldStuId = oldStuId;
    }

    public String getNewStuId() {
        return newStuId;
    }

    public void setNewStuId(String newStuId) {
        this.newStuId = newStuId;
    }

    public Byte getStuResponse() {
        return stuResponse;
    }

    public void setStuResponse(Byte stuResponse) {
        this.stuResponse = stuResponse;
    }

    @Override
    public String toString() {
        return "List{" +
        ", id = " + id +
        ", oldStu = " + oldStu +
        ", newStu = " + newStu +
        ", time = " + time +
        ", workHours = " + workHours +
        ", state = " + state +
        ", needToApproved = " + needToApproved +
        ", oldStuId = " + oldStuId +
        ", newStuId = " + newStuId +
        ", stuResponse = " + stuResponse +
        "}";
    }
}
