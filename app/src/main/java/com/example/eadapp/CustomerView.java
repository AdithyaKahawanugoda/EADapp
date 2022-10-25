package com.example.eadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class CustomerView extends AppCompatActivity {

    Button addNewVehicleBtn, viewQuotaBtn, joinQueueBtn, checkFuelAvailabilityBtn, checkPriceBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_view);

        addNewVehicleBtn = findViewById(R.id.customer_view_btn1);
        viewQuotaBtn = findViewById(R.id.customer_view_btn2);
        joinQueueBtn = findViewById(R.id.customer_view_btn3);
        checkFuelAvailabilityBtn = findViewById(R.id.customer_view_btn4);
        checkPriceBtn = findViewById(R.id.customer_view_btn5);

        addNewVehicleBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),AddNewVehicle.class)));
        viewQuotaBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),ViewQuota.class)));
        joinQueueBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),JoinQueue.class)));
        checkFuelAvailabilityBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),CheckFuelAvailability.class)));
        checkPriceBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),CheckPrice.class)));

    }
}