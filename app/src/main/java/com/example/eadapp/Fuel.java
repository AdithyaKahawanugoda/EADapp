package com.example.eadapp;

public class Fuel {
    String fuelType;
    String fuelStatus;

    //Constructor
    public Fuel(String fuelType, String fuelStatus){
        this.fuelType = fuelType;
        this.fuelStatus = fuelStatus;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelStatus() {
        return fuelStatus;
    }

    public void setFuelStatus(String fuelStatus) {
        this.fuelStatus = fuelStatus;
    }
}
