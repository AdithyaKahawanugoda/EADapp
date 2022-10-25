package com.example.eadapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OwnerView extends AppCompatActivity {

    Button restockBtn, updatePriceBtn, updateQuotaBtn, viewAvailabilityBtn, updateAvailabilityBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_view);

        restockBtn = findViewById(R.id.owner_view_btn1);
        updatePriceBtn = findViewById(R.id.owner_view_btn2);
        updateQuotaBtn = findViewById(R.id.owner_view_btn3);
        viewAvailabilityBtn = findViewById(R.id.owner_view_btn4);
        updateAvailabilityBtn = findViewById(R.id.owner_view_btn5);

        restockBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),Restock.class)));
        updatePriceBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),UpdatePrice.class)));
        updateQuotaBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),UpdateQuota.class)));
        viewAvailabilityBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),CheckFuelAvailability.class)));
        updateAvailabilityBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),UpdateAvailability.class)));

    }
}