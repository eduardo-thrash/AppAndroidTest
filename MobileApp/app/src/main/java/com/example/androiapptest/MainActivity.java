package com.example.androiapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.androiapptest.common.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        Intent Login = new Intent(this, LoginActivity.class);
        startActivity(Login);

        //setContentView(R.layout.activity_main);
    }
}
