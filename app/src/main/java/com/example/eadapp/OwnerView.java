package com.example.eadapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * OwnerView Class used to implement the menu which contains the actions the owner can perform in the app.
 */
public class OwnerView extends AppCompatActivity {

    Button restockBtn, updatePriceBtn, updateQuotaBtn, viewAvailabilityBtn, updateAvailabilityBtn;

    /**
     * Method used when an activity is first created
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_view);

        //find and initialize views of buttons
        restockBtn = findViewById(R.id.owner_view_btn1);
        updatePriceBtn = findViewById(R.id.owner_view_btn2);
        updateQuotaBtn = findViewById(R.id.owner_view_btn3);
        viewAvailabilityBtn = findViewById(R.id.owner_view_btn4);
        updateAvailabilityBtn = findViewById(R.id.owner_view_btn5);

        //assign the listener to the buttons and navigate to activity screens
        restockBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),Restock.class)));
        updatePriceBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),UpdatePrice.class)));
        updateQuotaBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),UpdateQuota.class)));
        viewAvailabilityBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),CheckFuelAvailability.class)));
        updateAvailabilityBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),UpdateAvailability.class)));

    }
}