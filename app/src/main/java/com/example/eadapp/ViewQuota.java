package com.example.eadapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ViewQuota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_quota);
        RecyclerView viewQuota = findViewById(R.id.view_quota_recycler);
        ArrayList<VehicleList> vehicleList = new ArrayList<VehicleList>();
        vehicleList.add(new VehicleList("NA-5634","Car", "AZ-12-2345-123", 20, 12));
        vehicleList.add(new VehicleList("NA-5634","Car", "AZ-12-2345-123", 20, 12));
        ViewQuotaAdapter viewQuotaAdapter = new ViewQuotaAdapter(this, vehicleList);
        viewQuota.setAdapter(viewQuotaAdapter);
    }
}