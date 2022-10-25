package com.example.eadapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

/**
 * ViewQuota Class implements the functionality of when a user views the weekly quota of fuel.
 */
public class ViewQuota extends AppCompatActivity {

    /**
     * Method used when an activity is first created
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_quota);

        RecyclerView viewQuota = findViewById(R.id.view_quota_recycler);

        ArrayList<VehicleList> vehicleList = new ArrayList<>();
        vehicleList.add(new VehicleList("NA-5634","Car", "AZ-12-2345-123", 20, 12));
        vehicleList.add(new VehicleList("NA-5635","Car", "AZ-12-2345-123", 20, 12));

        //initialize adapter and pass arraylist
        ViewQuotaAdapter viewQuotaAdapter = new ViewQuotaAdapter(this, vehicleList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        //set layout manager and adapter to recycler view
        viewQuota.setLayoutManager(linearLayoutManager);
        viewQuota.setAdapter(viewQuotaAdapter);
    }
}