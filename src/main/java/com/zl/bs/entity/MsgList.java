package com.zl.bs.entity;

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
@TableName("teacher_msg_list")
public class MsgList implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String title;
    private String content;
    private String time;
    private Byte comfirm;

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Byte getComfirm() {
        return comfirm;
    }

    public void setComfirm(Byte comfirm) {
        this.comfirm = comfirm;
    }

    @Override
    public String toString() {
        return "MsgList{" +
        ", id = " + id +
        ", title = " + title +
        ", content = " + content +
        ", time = " + time +
        ", comfirm = " + comfirm +
        "}";
    }
}
