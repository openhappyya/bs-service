package com.zl.bs.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zl
 * @since 2023-04-18
 */
public class Result implements Serializable {

    private static final long serialVersionUID = 1L;
    private String guid;
    private String stuId;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    @Override
    public String toString() {
        return "Result{" +
        ", guid = " + guid +
        ", stuId = " + stuId +
        "}";
    }
}
