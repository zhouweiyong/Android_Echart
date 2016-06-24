package com.zwy.echartdemo.chartbean;

import java.util.ArrayList;

/**
 * @author zwy
 * @email 16681805@qq.com
 * created on 2016/6/24
 * class description:请输入类描述
 */
public class BarChartBean {
    private TooltipBean tooltip;
    private LegendBean legend;
    private ArrayList<XAxisItemBean> xAxis;
    private ArrayList<YAxisItemBean> yAxis;
    private ArrayList<SeriesItemBean> series;
    private GridBean grid;

    public GridBean getGrid() {
        return grid;
    }

    public void setGrid(GridBean grid) {
        this.grid = grid;
    }

    public TooltipBean getTooltip() {
        return tooltip;
    }

    public void setTooltip(TooltipBean tooltip) {
        this.tooltip = tooltip;
    }

    public LegendBean getLegend() {
        return legend;
    }

    public void setLegend(LegendBean legend) {
        this.legend = legend;
    }

    public ArrayList<XAxisItemBean> getxAxis() {
        return xAxis;
    }

    public void setxAxis(ArrayList<XAxisItemBean> xAxis) {
        this.xAxis = xAxis;
    }

    public ArrayList<YAxisItemBean> getyAxis() {
        return yAxis;
    }

    public void setyAxis(ArrayList<YAxisItemBean> yAxis) {
        this.yAxis = yAxis;
    }

    public ArrayList<SeriesItemBean> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<SeriesItemBean> series) {
        this.series = series;
    }
}
