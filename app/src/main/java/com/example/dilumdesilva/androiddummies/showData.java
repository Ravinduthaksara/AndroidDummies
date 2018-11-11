package com.example.dilumdesilva.androiddummies;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class showData extends AppCompatActivity {

    private String userName;
    private TextView tv_showData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        tv_showData = (TextView) findViewById(R.id.tv_showData_welcome);

        Intent intent = getIntent();

        userName = intent.getStringExtra("USERNAME");
        tv_showData.append(userName);
    }



}
