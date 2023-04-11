package com.zl.bs.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2023-04-05
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    private String stuId;
    private String stuName;
    private String stuDepartment;
    private String phoneNumber;
    private Integer maxWorkHours;

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

    public String getStuDepartment() {
        return stuDepartment;
    }

    public void setStuDepartment(String stuDepartment) {
        this.stuDepartment = stuDepartment;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getMaxWorkHours() {
        return maxWorkHours;
    }

    public void setMaxWorkHours(Integer maxWorkHours) {
        this.maxWorkHours = maxWorkHours;
    }

    @Override
    public String toString() {
        return "Student{" +
        ", stuId = " + stuId +
        ", stuName = " + stuName +
        ", stuDepartment = " + stuDepartment +
        ", phoneNumber = " + phoneNumber +
        ", maxWorkHours = " + maxWorkHours +
        "}";
    }
}
