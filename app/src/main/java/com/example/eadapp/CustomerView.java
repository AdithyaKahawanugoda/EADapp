package com.example.eadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class CustomerView extends AppCompatActivity {

    Button addNewVehicleBtn, viewQuotaBtn, pumpFuelBtn, fuelAvailabilityBtn, priceListBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_view);

        addNewVehicleBtn = findViewById(R.id.customer_view_btn1);
        viewQuotaBtn = findViewById(R.id.customer_view_btn2);
        pumpFuelBtn = findViewById(R.id.customer_view_btn3);
        fuelAvailabilityBtn = findViewById(R.id.customer_view_btn4);
        priceListBtn = findViewById(R.id.customer_view_btn5);

        addNewVehicleBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),AddNewVehicle.class)));
//        viewQuotaBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),UpdatePrice.class)));
//        pumpFuelBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),UpdateQuota.class)));
//        fuelAvailabilityBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),xxx.class)));
//        priceListBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),UpdateAvailability.class)));

    }
}