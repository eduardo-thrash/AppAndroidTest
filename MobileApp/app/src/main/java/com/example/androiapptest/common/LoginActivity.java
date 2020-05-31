package com.example.androiapptest.common;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.androiapptest.R;
import com.example.businessrules.DepartureBusinessRules;

public class LoginActivity extends AppCompatActivity {

    DepartureBusinessRules departure = new DepartureBusinessRules();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        int Menu = 2;

        if(Menu==1){
            Toast toast=Toast.makeText(getApplicationContext(),departure.MaterialStatusUpdate(),Toast.LENGTH_SHORT);
            toast.show();
        }else{
            Toast toast=Toast.makeText(getApplicationContext(),departure.GetMaterial(),Toast.LENGTH_SHORT);
            toast.show();
        }


    }
}
