package com.zwy.echartdemo.chartbean;

import java.util.ArrayList;

/**
 * @author zwy
 * @email 16681805@qq.com
 * created on 2016/6/24
 * class description:请输入类描述
 */
public class SeriesItemBean {
    private String name;
    private String type;
    private int barWidth;
    private ArrayList<Integer> data;

    public int getBarWidth() {
        return barWidth;
    }

    public void setBarWidth(int barWidth) {
        this.barWidth = barWidth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public void setData(ArrayList<Integer> data) {
        this.data = data;
    }
}
