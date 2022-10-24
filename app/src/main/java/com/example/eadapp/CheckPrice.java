package com.example.eadapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class CheckPrice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_price);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RecyclerView checkPrice = findViewById(R.id.check_price_recycler);
        ArrayList<PriceList> priceList = new ArrayList<PriceList>();
        priceList.add(new PriceList("Octane", 435));
        priceList.add(new PriceList("Octane", 435));
        PriceListAdapter priceListAdapter = new PriceListAdapter(this, priceList);
        checkPrice.setAdapter(priceListAdapter);
    }
}