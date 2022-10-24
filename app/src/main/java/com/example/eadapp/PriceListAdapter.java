package com.example.eadapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PriceListAdapter extends RecyclerView.Adapter<PriceListAdapter.ViewHolder> {
final Context context;
private final ArrayList<PriceList> priceList;

public PriceListAdapter(Context context, ArrayList<PriceList> priceList){
        this.context = context;
        this.priceList = priceList;
        }

@NonNull
@Override
public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.price_card_layout, parent, false);
        return new ViewHolder(view);
        }

@Override
public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PriceList prices = priceList.get(position);
        holder.fuelType.setText(prices.fuelType);
        holder.price.setText(prices.price);
        }

@Override
public int getItemCount() {
        return priceList.size();
        }

public class ViewHolder extends RecyclerView.ViewHolder{
    private final TextView fuelType;
    private final TextView price;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        fuelType = itemView.findViewById(R.id.priceCard_TextViewR1);
        price = itemView.findViewById(R.id.priceCard_TextViewR2);
    }
}
}
