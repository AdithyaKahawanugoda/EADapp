package com.example.eadapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class JoinQueueAdapter extends RecyclerView.Adapter<JoinQueueAdapter.ViewHolder> {
    final Context context;
    private final ArrayList<Queue> queueArrayList;

    public JoinQueueAdapter(Context context, ArrayList<Queue> queueArrayList){
        this.context = context;
        this.queueArrayList = queueArrayList;
    }

    @NonNull
    @Override
    public JoinQueueAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new JoinQueueAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JoinQueueAdapter.ViewHolder holder, int position) {
        Queue queues = queueArrayList.get(position);
        holder.queueLength.setText(queueArrayList.size());
        holder.fuelType.setText(queues.fuelType);
        holder.fuelStatus.setText(queues.visitStatus);
        holder.timeSpent.setText(queues.arrivalTime-queues.exitTime);
    }

    @Override
    public int getItemCount() {
        return queueArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView timeSpent;
        private final TextView fuelStatus;
        private final TextView queueLength;
        private final TextView fuelType;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fuelType = itemView.findViewById(R.id.pumpFuelCard_TextViewR1);
            queueLength = itemView.findViewById(R.id.pumpFuelCard_TextViewR2);
            fuelStatus = itemView.findViewById(R.id.pumpFuelCard_TextViewR3);
            timeSpent = itemView.findViewById(R.id.pumpFuelCard_TextViewR4);
        }
    }
}
