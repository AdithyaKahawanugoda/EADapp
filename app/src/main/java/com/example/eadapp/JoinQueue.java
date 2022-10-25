package com.example.eadapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class JoinQueue extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner stationSpinner = findViewById(R.id.fuelPump_station_spinner);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_queue);


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
        RecyclerView pumpFuel = findViewById(R.id.join_queue_recycler);
        ArrayList<Queue> queueArrayList = new ArrayList<Queue>();
        queueArrayList.add(new Queue("CU001","A-1", "Petrol", "NA-1234", "24/10/22", 8, 10, "Active"));
        JoinQueueAdapter joinQueueAdapter = new JoinQueueAdapter(this, queueArrayList);
        pumpFuel.setAdapter(joinQueueAdapter);
//      IMPLEMENT Button change after clicking JOIN QUEUE

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}