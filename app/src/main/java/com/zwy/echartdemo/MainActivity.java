package com.zwy.echartdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_line;
    private Button btn_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn_line = (Button) findViewById(R.id.btn_line);
        btn_bar = (Button) findViewById(R.id.btn_bar);

        btn_line.setOnClickListener(this);
        btn_bar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_line:

                break;
            case R.id.btn_bar:
                Intent barIntent = new Intent(MainActivity.this,BarChartActivity.class);
                startActivity(barIntent);
                break;
        }
    }
}
