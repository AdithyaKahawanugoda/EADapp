package com.example.eadapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

/**
 *
 * CheckFuelAvailability Class contains all activities related to the viewing of the availability of fuel
 *
 */
public class CheckFuelAvailability extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    /**
     * Method used when an activity is first created
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_fuel_availability);

        RecyclerView fuelAvailability = findViewById(R.id.check_fuel_availability_recycler);
        ArrayList<Fuel> fuelList = new ArrayList<Fuel>();
        fuelList.add(new Fuel("Petrol","Available"));

        //initialize adapter and pass arraylist
        FuelAdapter fuelAdapter = new FuelAdapter(this, fuelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        //setting layout manager and adapter to the recycler view
        fuelAvailability.setLayoutManager(linearLayoutManager);
        fuelAvailability.setAdapter(fuelAdapter);

        Spinner stationSpinner = findViewById(R.id.check_fuel_availability_station_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
        R.array.station_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        stationSpinner.setAdapter(adapter);
        stationSpinner.setOnItemSelectedListener(this);
    }

    /**
     * Method used to callback when an item is selected in this view
     *
     * @param adapterView
     * @param view
     * @param i
     * @param l
     */
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();

        if(!adapterView.getItemAtPosition(i).equals("Select Station")) {
            Toast.makeText(adapterView.getContext(),text,Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}