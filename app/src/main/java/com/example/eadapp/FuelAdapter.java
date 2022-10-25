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
 * FuelAdapter Class used to set up data items of recycler view in CheckFuelAvailability Activity
 */
public class FuelAdapter extends RecyclerView.Adapter<FuelAdapter.ViewHolder> {
    final Context context;
    private final ArrayList<Fuel> fuelList;

    /**
     * Constructor
     *
     * @param context
     * @param fuelList
     */
    public FuelAdapter(Context context, ArrayList<Fuel> fuelList){
        this.context = context;
        this.fuelList = fuelList;
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fuel_availability_card_layout, parent, false);
        return new ViewHolder(view);
    }

    /**
     * Method used to display data at the specified location
     *
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull FuelAdapter.ViewHolder holder, int position) {
        //assigning values to text views in the card layout
        Fuel fuel = fuelList.get(position);
        holder.fuelType.setText(fuel.getFuelType());
        holder.fuelStatus.setText(fuel.getFuelStatus());
    }

    /**
     * Method returns the total number of items in data being held by adapter
     *
     * @return
     */
    @Override
    public int getItemCount() {
        //display the number of cards in the recycler view
        return fuelList.size();
    }

    /**
     * ViewHolder Class caches data and information about action item layouts' sub views
     */
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
