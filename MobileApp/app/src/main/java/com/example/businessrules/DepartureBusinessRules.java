package com.example.businessrules;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.example.androiapptest.R;

public class DepartureBusinessRules {

    public int MaterialId;
    public int MaterialStatus;
    public int SiteId;
    public int UserAssigned;

    public String MaterialStatusUpdate(){
        return "Material Status update";
    }

    public String GetMaterial(){
        return "Get Material";
    }
}
