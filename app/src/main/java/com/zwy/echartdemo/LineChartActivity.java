package com.zwy.echartdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

/**
 * @author zwy
 * @email 16681805@qq.com
 * created on 2016/6/24
 * class description:请输入类描述
 */
public class LineChartActivity extends Activity implements View.OnClickListener {

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
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_week:

                break;
            case R.id.btn_month:

                break;
            case R.id.btn_year:

                break;
        }
    }
}
