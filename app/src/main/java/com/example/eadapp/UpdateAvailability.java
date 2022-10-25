package com.example.eadapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * UpdateAvailability Class implements the functionality of when the owner updates the fuel availability
 */
public class UpdateAvailability extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    /**
     * Method used when an activity is first created
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_availability);

        Spinner fuelTypesSpinner = findViewById(R.id.ufa_input_fuel_spinner);
        Spinner fuelAvailabilityStatusSpinner = findViewById(R.id.update_availability_status_spinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.fuel_types_array, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.fuel_availability_status_array, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        fuelTypesSpinner.setAdapter(adapter1);
        fuelTypesSpinner.setOnItemSelectedListener(this);

        fuelAvailabilityStatusSpinner.setAdapter(adapter2);
        fuelAvailabilityStatusSpinner.setOnItemSelectedListener(this);
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

        if(!adapterView.getItemAtPosition(i).equals("Select Fuel Type") && !adapterView.getItemAtPosition(i).equals("Select Availability")) {
            Toast.makeText(adapterView.getContext(),text,Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}