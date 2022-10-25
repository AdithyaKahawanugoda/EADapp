package com.example.eadapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ViewQuotaAdapter extends RecyclerView.Adapter<ViewQuotaAdapter.ViewHolder> {
    final Context context;
    private final ArrayList<VehicleList> vehicleList;

    public ViewQuotaAdapter(Context context, ArrayList<VehicleList> vehicleList){
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
        holder.vehicleNo.setText(vehicles.getVehicleNo());
        holder.allocatedQuota.setText(vehicles.getFuelQuota());
        holder.remainingQuota.setText(vehicles.getRemainingQuota());
    }

    @Override
    public int getItemCount() {
        return vehicleList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView vehicleNo;
        private final TextView allocatedQuota;
        private final TextView remainingQuota;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            vehicleNo = itemView.findViewById(R.id.cardLayoutTextViewR1);
            allocatedQuota = itemView.findViewById(R.id.cardLayoutTextViewR2);
            remainingQuota = itemView.findViewById(R.id.cardLayoutTextViewR3);
        }
    }


}
