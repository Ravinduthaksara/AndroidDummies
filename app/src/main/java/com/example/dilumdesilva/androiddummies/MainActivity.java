package com.example.dilumdesilva.androiddummies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_register;
    private TextView tv_welcome;
    private EditText et_userInput;
    private String userName = "User";

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
        Intent intent = new Intent(this, showData.class);
        intent.putExtra("USERNAME", userName);
        startActivity(intent);

    }
}
