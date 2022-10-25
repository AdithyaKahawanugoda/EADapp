package com.example.eadapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * JoinQueueAdapter Class used to set up data items of recycler view in JoinQueue Activity
 */
public class JoinQueueAdapter extends RecyclerView.Adapter<JoinQueueAdapter.ViewHolder> {
    final Context context;
    private final ArrayList<Queue> queueArrayList;

    /**
     * Constructor
     *
     * @param context
     * @param queueArrayList
     */
    public JoinQueueAdapter(Context context, ArrayList<Queue> queueArrayList){
        this.context = context;
        this.queueArrayList = queueArrayList;
    }

    /**
     * Method is called when a new view needs to be created
     *
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflate the layout for each of the items in the recyclerview
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pump_fuel_card_layout, parent, false);
        return new ViewHolder(view);
    }

    /**
     * Method used to display data at the specified location
     *
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull JoinQueueAdapter.ViewHolder holder, int position) {
        //assigning values to text views in the card layout
        Queue queues = queueArrayList.get(position);
        holder.queueLength.setText(queueArrayList.size()+"");
        holder.fuelType.setText(queues.getFuelType());
        holder.fuelStatus.setText(queues.getVisitStatus());
        holder.timeSpent.setText(Integer.toString(queues.getExitTime()-queues.getArrivalTime()));
    }

    /**
     * Method returns the total number of items in data being held by adapter
     *
     * @return
     */
    @Override
    public int getItemCount() {
        //display the number of cards in the recycler view
        return queueArrayList.size();
    }

    /**
     * ViewHolder Class caches data and information about action item layouts' sub views
     */
    public class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView timeSpent;
        private final TextView fuelStatus;
        private final TextView queueLength;
        private final TextView fuelType;

        public ViewHolder(@NonNull View itemView) {
            //initialize views
            super(itemView);
            fuelType = itemView.findViewById(R.id.pumpFuelCard_TextViewR1);
            queueLength = itemView.findViewById(R.id.pumpFuelCard_TextViewR2);
            fuelStatus = itemView.findViewById(R.id.pumpFuelCard_TextViewR3);
            timeSpent = itemView.findViewById(R.id.pumpFuelCard_TextViewR4);
        }
    }
}
