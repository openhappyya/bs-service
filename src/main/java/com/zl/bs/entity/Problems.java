package com.zl.bs.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zl
 * @since 2023-04-05
 */
public class Problems implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String title;
    private String content;
    private String stuName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public String toString() {
        return "Problems{" +
        ", id = " + id +
        ", title = " + title +
        ", content = " + content +
        ", stuName = " + stuName +
        "}";
    }
}
