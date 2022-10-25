package com.example.eadapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class CheckFuelAvailability extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner stationSpinner = findViewById(R.id.check_fuel_availability_station_spinner);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_fuel_availability);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.station_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        stationSpinner.setAdapter(adapter);
        stationSpinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String spinnerValue = stationSpinner.getSelectedItem().toString();
//        if(spinnerValue){} ---IMPLEMENT- Fetch DB data values to Arraylist according to the spinner value
        RecyclerView fuelAvailability = findViewById(R.id.check_fuel_availability_recycler);
        ArrayList<Fuel> fuelList = new ArrayList<Fuel>();
        fuelList.add(new Fuel("Petrol","Available"));
        FuelAdapter fuelAdapter = new FuelAdapter(this, fuelList);
        fuelAvailability.setAdapter(fuelAdapter);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}