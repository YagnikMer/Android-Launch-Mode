package com.worldmer.activitylaunchmodedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class A_Activity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        initilize();
    }

    public void initilize() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                startActivity(new Intent(this,A_Activity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(this,B_Activity.class));
                break;
            case R.id.btn3:
                startActivity(new Intent(this,C_Activity.class));
                break;
            case R.id.btn4:
                startActivity(new Intent(this,D_Activity.class));
                break;
        }
    }
}