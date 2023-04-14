package com.zl.bs.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zl
 * @since 2023-04-13
 */
@TableName("dummy_tick_data")
public class TickData implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dayTime;
    private String text;
    private String descContent;

    public String getDayTime() {
        return dayTime;
    }

    public void setDayTime(String dayTime) {
        this.dayTime = dayTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDescContent() {
        return descContent;
    }

    public void setDescContent(String descContent) {
        this.descContent = descContent;
    }

    @Override
    public String toString() {
        return "TickData{" +
        ", dayTime = " + dayTime +
        ", text = " + text +
        ", descContent = " + descContent +
        "}";
    }
}
