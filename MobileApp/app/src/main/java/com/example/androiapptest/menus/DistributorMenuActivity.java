package com.example.androiapptest.menus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.androiapptest.R;
import com.example.androiapptest.common.PasswordChangeActivity;
import com.example.androiapptest.common.UserHelpActivity;
import com.example.androiapptest.departures.RegisterDepartureActivity;

public class DistributorMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distributor_menu);
    }

    public void RegisterDepartureView (View view){
        Intent RegisterDeparture = new Intent(this, RegisterDepartureActivity.class);
        startActivity(RegisterDeparture);

    }

    public void DistributorLogout (View view){
        finish();

    }

    public void PasswordChange (View view) {
        Intent PasswordChange = new Intent(this, PasswordChangeActivity.class);
        startActivity(PasswordChange);
    }

    public void Help (View view){
        Intent UserHelp = new Intent(this, UserHelpActivity.class);
        startActivity(UserHelp);

    }
}
