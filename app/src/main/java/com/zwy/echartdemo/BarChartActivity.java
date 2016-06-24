package com.zwy.echartdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.google.gson.Gson;
import com.zwy.echartdemo.chartbean.BarChartBean;
import com.zwy.echartdemo.chartbean.GridBean;
import com.zwy.echartdemo.chartbean.LegendBean;
import com.zwy.echartdemo.chartbean.SeriesItemBean;
import com.zwy.echartdemo.chartbean.TooltipBean;
import com.zwy.echartdemo.chartbean.XAxisItemBean;
import com.zwy.echartdemo.chartbean.YAxisItemBean;

import java.util.ArrayList;

/**
 * @author zwy
 * @email 16681805@qq.com
 * created on 2016/6/24
 * class description:请输入类描述
 */
public class BarChartActivity extends Activity implements View.OnClickListener {

    private Button btn_week;
    private Button btn_month;
    private Button btn_year;
    private WebView wv_line;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart);
        initView();

    }

    private void initView() {
        btn_week = (Button) findViewById(R.id.btn_week);
        btn_month = (Button) findViewById(R.id.btn_month);
        btn_year = (Button) findViewById(R.id.btn_year);
        wv_line = (WebView) findViewById(R.id.wv_line);

        btn_week.setOnClickListener(this);
        btn_month.setOnClickListener(this);
        btn_year.setOnClickListener(this);



        wv_line.loadUrl( "file:///android_asset/barDemo.html");
        WebSettings webSettings = wv_line.getSettings();
        webSettings.setJavaScriptEnabled( true);
//        webSettings.setSupportZoom( false);
//        //监听http页面跳转（a标签）
//        wv_line.setWebViewClient( new WebViewClient());
//        //监听http页面的JavaScript事件
//        //wv_line.addJavascriptInterface( new DemoJavaScriptInterface(), "zwy" );
//
       // wv_line.setWebChromeClient(new WebChromeClient());

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_week:
                wv_line.loadUrl("javascript:loadData("+getData()+")");
                break;
            case R.id.btn_month:

                break;
            case R.id.btn_year:


                break;
        }
    }

    private String getData(){
        BarChartBean barChartBean = new BarChartBean();

        TooltipBean tooltipBean = new TooltipBean();
        tooltipBean.setShow("true");
        barChartBean.setTooltip(tooltipBean);

        GridBean gridBean = new GridBean();
        gridBean.setX(20);
        gridBean.setY(20);
        gridBean.setX2(0);
        gridBean.setHeight("100");
        barChartBean.setGrid(gridBean);

        LegendBean legendBean = new LegendBean();
        ArrayList<String> legendData = new ArrayList<>();
//        legendData.add("销量");
        legendBean.setData(legendData);
        barChartBean.setLegend(legendBean);

        ArrayList<XAxisItemBean> xAxisItemBeens = new ArrayList<>();
        XAxisItemBean xAxisItemBean1 = new XAxisItemBean();
        xAxisItemBean1.setType("category");
        ArrayList<String> xAxisData1 = new ArrayList<>();
        xAxisData1.add("衬衫");
        xAxisData1.add("羊毛衫");
        xAxisData1.add("雪纺衫");
        xAxisData1.add("裤子");
        xAxisData1.add("高跟鞋");
        xAxisData1.add("袜子");
        xAxisItemBean1.setData(xAxisData1);
        xAxisItemBeens.add(xAxisItemBean1);
        barChartBean.setxAxis(xAxisItemBeens);

        ArrayList<YAxisItemBean> yAxisItemBeens = new ArrayList<>();
        YAxisItemBean yAxisItemBean1= new YAxisItemBean();
        yAxisItemBean1.setType("value");
        yAxisItemBeens.add(yAxisItemBean1);
        barChartBean.setyAxis(yAxisItemBeens);

        ArrayList<SeriesItemBean> seriesItemBeens = new ArrayList<>();
        SeriesItemBean seriesItemBean1 = new SeriesItemBean();
        seriesItemBean1.setName("销量");
        seriesItemBean1.setType("bar");
        seriesItemBean1.setBarWidth(10);
        ArrayList<Integer> seriesData1 = new ArrayList<>();
        seriesData1.add(5);
        seriesData1.add(20);
        seriesData1.add(40);
        seriesData1.add(10);
        seriesData1.add(10);
        seriesData1.add(20);
        seriesItemBean1.setData(seriesData1);
        seriesItemBeens.add(seriesItemBean1);
        barChartBean.setSeries(seriesItemBeens);



        Gson gson = new Gson();
        String json = gson.toJson(barChartBean);
        return json;
    }
}
