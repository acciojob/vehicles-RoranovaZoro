package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int capacity;

    //--------------------------------- constructor -----------------------------
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Boat() {
    }

    //--------------------------------- setters -------------------------------------

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //------------- getters overloaded from interface ----------------------------
    @Override
    public String getVehicleName() {
        return this.name;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }
}