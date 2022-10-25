package com.example.eadapp;

/**
 * Model Class for Fuel
 */
public class Fuel {
    String fuelType;
    String fuelStatus;

    /**
     * Constructor
     *
     * @param fuelType
     * @param fuelStatus
     */
    public Fuel(String fuelType, String fuelStatus){
        this.fuelType = fuelType;
        this.fuelStatus = fuelStatus;
    }

    //getters and setters
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
