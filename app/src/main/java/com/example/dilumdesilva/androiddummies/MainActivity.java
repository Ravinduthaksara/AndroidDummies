package com.example.dilumdesilva.androiddummies;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;

public class MainActivity extends AppCompatActivity implements LifecycleObserver {

    private Button btn_register;
    private TextView tv_welcome;
    private EditText et_userInput;
    private String userName = "User";

    String state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_register = (Button) findViewById(R.id.btn_register);
        tv_welcome = (TextView) findViewById(R.id.tv_welcome);
        et_userInput = (EditText) findViewById(R.id.et_inputName);

    }


    public void sendMsg(View view) {
        userName = et_userInput.getText().toString();

        //crating a new intent in order to start next activity with the captured data
        final Intent intent = new Intent(this, showData.class);

        //binding data via intent
        intent.putExtra("USERNAME", userName);


        //creating a toast to show the state of the button press
        Toast.makeText(getApplicationContext(), "Registration Successful", Toast.LENGTH_SHORT).show();

        //adding a delay between the toast and the next activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
            }
        }, 1800);

    }

}
