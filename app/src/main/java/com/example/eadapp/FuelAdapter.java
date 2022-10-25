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

    public FuelAdapter(Context context, ArrayList<Fuel> fuelList){
        this.context = context;
        this.fuelList = fuelList;
    }

    @NonNull
    @Override
    public FuelAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new FuelAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FuelAdapter.ViewHolder holder, int position) {
        Fuel fuel = fuelList.get(position);
        holder.fuelType.setText(fuel.fuelType);
        holder.fuelStatus.setText(fuel.fuelStatus);
    }

    @Override
    public int getItemCount() {
        return fuelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView fuelType;
        private final TextView fuelStatus;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fuelType = itemView.findViewById(R.id.fuelAvailabilityCard_TextViewR1);
            fuelStatus = itemView.findViewById(R.id.fuelAvailabilityCard_TextViewR2);
        }
    }
}
