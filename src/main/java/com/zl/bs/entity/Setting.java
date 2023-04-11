package com.zl.bs.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zl
 * @since 2023-04-08
 */
@TableName("basic_setting")
public class Setting implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private Integer stateTime;
    private Byte stateAutomatic;
    private Integer tickRange;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getStateTime() {
        return stateTime;
    }

    public void setStateTime(Integer stateTime) {
        this.stateTime = stateTime;
    }

    public Byte getStateAutomatic() {
        return stateAutomatic;
    }

    public void setStateAutomatic(Byte stateAutomatic) {
        this.stateAutomatic = stateAutomatic;
    }

    public Integer getTickRange() {
        return tickRange;
    }

    public void setTickRange(Integer tickRange) {
        this.tickRange = tickRange;
    }

    @Override
    public String toString() {
        return "Setting{" +
        ", id = " + id +
        ", stateTime = " + stateTime +
        ", stateAutomatic = " + stateAutomatic +
        ", tickRange = " + tickRange +
        "}";
    }
}
