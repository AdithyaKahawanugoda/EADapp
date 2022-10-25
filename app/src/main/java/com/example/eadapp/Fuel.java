package com.example.eadapp;

public class Fuel {
    String fuelType;
    String fuelStatus;

    //getters
    public String getFuelType() {
        return fuelType;
    }

    public String getFuelStatus() {
        return fuelStatus;
    }

    //Constructor
    public Fuel(String fuelType, String fuelStatus){
        this.fuelType = fuelType;
        this.fuelStatus = fuelStatus;
    }
}
