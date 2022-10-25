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
