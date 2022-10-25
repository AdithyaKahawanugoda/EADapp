package com.example.eadapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FuelAdapter extends RecyclerView.Adapter<FuelAdapter.ViewHolder> {
    final Context context;
    private final ArrayList<Fuel> fuelList;

    //Constructor
    public FuelAdapter(Context context, ArrayList<Fuel> fuelList){
        this.context = context;
        this.fuelList = fuelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflate the layout for each of the items in the recyclerview
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fuel_availability_card_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FuelAdapter.ViewHolder holder, int position) {
        //assigning values to text views in the card layout
        Fuel fuel = fuelList.get(position);
        holder.fuelType.setText(fuel.getFuelType());
        holder.fuelStatus.setText(fuel.getFuelStatus());
    }

    @Override
    public int getItemCount() {
        //display the number of cards in the recycler view
        return fuelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView fuelType;
        private final TextView fuelStatus;

        //initialize views
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fuelType = itemView.findViewById(R.id.fuelAvailabilityCard_TextViewR1);
            fuelStatus = itemView.findViewById(R.id.fuelAvailabilityCard_TextViewR2);
        }
    }
}
