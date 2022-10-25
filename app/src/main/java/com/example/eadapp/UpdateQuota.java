package com.example.eadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * UpdateQuota Class implements the functionality when an owner updates the weekly fuel quota in the app
 */
public class UpdateQuota extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    /**
     * Method used when an activity is first created
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_quota);

        Spinner vehicleTypesSpinner = findViewById(R.id.update_quota_input_vehicle_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.vehicle_types_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        vehicleTypesSpinner.setAdapter(adapter);
        vehicleTypesSpinner.setOnItemSelectedListener(this);
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

        if(!adapterView.getItemAtPosition(i).equals("Select Vehicle Type")) {
            Toast.makeText(adapterView.getContext(),text,Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}