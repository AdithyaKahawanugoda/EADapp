package com.example.eadapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class JoinQueue extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Button joinQueueBtn,ebpfBtn,eapfBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_queue);

        joinQueueBtn = findViewById(R.id.join_queue_btn1);
        eapfBtn = findViewById(R.id.join_queue_btn2);
        ebpfBtn = findViewById(R.id.join_queue_btn3);

        RecyclerView pumpFuel = findViewById(R.id.join_queue_recycler);
        ArrayList<Queue> queueArrayList = new ArrayList<Queue>();
        queueArrayList.add(new Queue("CU001","A-1", "Petrol (95 Octane)", "NA-1234", "24/10/22", 8, 10, "Active"));
        queueArrayList.add(new Queue("CU002","A-2", "Auto Diesel", "NA-1235", "24/10/22", 8, 10, "Active"));

        //initialize adapter and pass arraylist
        JoinQueueAdapter joinQueueAdapter = new JoinQueueAdapter(this, queueArrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        //set layout manager and adapter to recycler view
        pumpFuel.setLayoutManager(linearLayoutManager);
        pumpFuel.setAdapter(joinQueueAdapter);

        Spinner stationSpinner = findViewById(R.id.fuelPump_station_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
        R.array.station_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        stationSpinner.setAdapter(adapter);
        stationSpinner.setOnItemSelectedListener(this);

        eapfBtn.setEnabled(false);
        ebpfBtn.setEnabled(false);
        eapfBtn.setVisibility(View.INVISIBLE);
        ebpfBtn.setVisibility(View.INVISIBLE);

        joinQueueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                joinQueueBtn.setEnabled(false);
                eapfBtn.setEnabled(true);
                ebpfBtn.setEnabled(true);
                eapfBtn.setVisibility(View.VISIBLE);
                ebpfBtn.setVisibility(View.VISIBLE);
                joinQueueBtn.setVisibility(View.INVISIBLE);
            }
        });

        eapfBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                joinQueueBtn.setEnabled(true);
                startActivity(new Intent(getApplicationContext(),CustomerView.class));
            }
        });

        ebpfBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                joinQueueBtn.setEnabled(true);
                startActivity(new Intent(getApplicationContext(),CustomerView.class));
            }
        });

    }

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