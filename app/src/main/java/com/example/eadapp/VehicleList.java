package com.example.eadapp;

public class VehicleList {
    String vehicleNo;
    String vehicleType;
    String chassisNo;
    int fuelQuota;
    int remainingQuota;

    public VehicleList(){
    }

    public VehicleList(String vehicleNo, String vehicleType, String chassisNo, int fuelQuota, int remainingQuota){
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.chassisNo = chassisNo;
        this.fuelQuota = fuelQuota;
        this.remainingQuota = remainingQuota;
    }
}
