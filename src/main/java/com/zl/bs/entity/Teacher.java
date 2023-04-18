package com.zl.bs.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zl
 * @since 2023-04-19
 */
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;
    private String teacherId;
    private String teacherPwd;
    private String teacherName;
    private Byte loginState;
    private Byte rosterComfirm;

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherPwd() {
        return teacherPwd;
    }

    public void setTeacherPwd(String teacherPwd) {
        this.teacherPwd = teacherPwd;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Byte getLoginState() {
        return loginState;
    }

    public void setLoginState(Byte loginState) {
        this.loginState = loginState;
    }

    public Byte getRosterComfirm() {
        return rosterComfirm;
    }

    public void setRosterComfirm(Byte rosterComfirm) {
        this.rosterComfirm = rosterComfirm;
    }

    @Override
    public String toString() {
        return "Teacher{" +
        ", teacherId = " + teacherId +
        ", teacherPwd = " + teacherPwd +
        ", teacherName = " + teacherName +
        ", loginState = " + loginState +
        ", rosterComfirm = " + rosterComfirm +
        "}";
    }
}
