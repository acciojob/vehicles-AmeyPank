package com.driver;

public class Boat implements WaterVehicle {
    String name;
    int capacity;

//    public Boat(){
//
//    }
    public Boat(String name, int capacity){
        this.capacity = capacity;
        this.name = name;

    }

    @Override
    public String getVehicleName() {
        return null;
    }

    @Override
    public int getVehicleCapacity() {
        return 0;
    }
}
