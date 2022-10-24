package com.example.eadapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    final Context context;
    private final ArrayList<VehicleList> vehicleList;

    public RecyclerViewAdapter(Context context, ArrayList<VehicleList> vehicleList){
        this.context = context;
        this.vehicleList = vehicleList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        VehicleList vehicles = vehicleList.get(position);
        holder.vehicleNo.setText(vehicles.vehicleNo);
        holder.availableQuota.setText(vehicles.fuelQuota);
        holder.remainingQuota.setText(vehicles.fuelQuota);
    }

    @Override
    public int getItemCount() {
        return vehicleList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView vehicleNo;
        private final TextView availableQuota;
        private final TextView remainingQuota;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            vehicleNo = itemView.findViewById(R.id.cardLayoutTextViewR1);
            availableQuota = itemView.findViewById(R.id.cardLayoutTextViewR2);
            remainingQuota = itemView.findViewById(R.id.cardLayoutTextViewR3);
        }
    }


}
