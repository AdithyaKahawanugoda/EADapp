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
 * PriceListAdapter Class used to set up data items of recycler view in CheckPrice Activity
 */
public class PriceListAdapter extends RecyclerView.Adapter<PriceListAdapter.ViewHolder> {
    final Context context;
    private final ArrayList<PriceList> priceList;

    /**
     * Constructor
     *
     * @param context
     * @param priceList
     */
    public PriceListAdapter(Context context, ArrayList<PriceList> priceList){
        this.context = context;
        this.priceList = priceList;
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
        ////inflate the layout for each of the items in the recyclerview
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.price_card_layout, parent, false);
        return new ViewHolder(view);
    }

    /**
     * Method used to display data at the specified location
     *
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //assigning values to text views in the card layout
        PriceList prices = priceList.get(position);
        holder.fuelType.setText(prices.getFuelType());
        holder.price.setText(prices.getPrice() +"");
    }

    /**
     * Method returns the total number of items in data being held by adapter
     *
     * @return
     */
    @Override
    public int getItemCount() {
        //display the number of cards in the recycler view
        return priceList.size();
    }

    /**
     * ViewHolder Class caches data and information about action item layouts' sub views
     */
    public class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView fuelType;
        private final TextView price;

        public ViewHolder(@NonNull View itemView) {
            //initialize views
            super(itemView);
            fuelType = itemView.findViewById(R.id.priceCard_TextViewR1);
            price = itemView.findViewById(R.id.priceCard_TextViewR2);
        }
    }
}
