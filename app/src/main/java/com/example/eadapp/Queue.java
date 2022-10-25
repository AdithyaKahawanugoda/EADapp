package com.example.eadapp;

public class Queue {
    String customerId;
    String stationId;
    String fuelType;
    String vehicleNo;
    String date;
    int arrivalTime;
    int exitTime;
    String visitStatus;

    //Getters
    public String getCustomerId() {
        return customerId;
    }

    public String getStationId() {
        return stationId;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getDate() {
        return date;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getExitTime() {
        return exitTime;
    }

    public String getVisitStatus() {
        return visitStatus;
    }

    //Constructor
    public Queue(String customerId, String stationId, String fuelType, String vehicleNo, String date, int arrivalTime, int exitTime, String visitStatus){
        this.customerId = customerId;
        this.stationId = stationId;
        this.fuelType = fuelType;
        this.vehicleNo = vehicleNo;
        this.date = date;
        this.arrivalTime = arrivalTime;
        this.exitTime = exitTime;
        this.visitStatus =visitStatus;
    }

}
