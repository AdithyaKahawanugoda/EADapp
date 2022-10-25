package com.example.eadapp;

public class PriceList {
    String fuelType;
    int price;

    //Getter
    public String getFuelType() {
        return fuelType;
    }

    public int getPrice() {
        return price;
    }

    //Constructor
    PriceList(String fuelType, int price){
        this.fuelType = fuelType;
        this.price = price;
    }
}
