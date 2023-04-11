package com.zl.bs.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zl
 * @since 2023-04-10
 */
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;
    private String teacherId;
    private String teacherPwd;
    private String teacherName;
    private Byte loginState;

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

    @Override
    public String toString() {
        return "Teacher{" +
        ", teacherId = " + teacherId +
        ", teacherName = " + teacherName +
        ", loginState = " + loginState +
        "}";
    }
}
