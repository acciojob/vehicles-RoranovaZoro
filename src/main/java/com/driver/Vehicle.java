package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        currentDirection += direction;
        System.out.println("Steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction) {
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("Move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop() {
        currentSpeed = 0;
        System.out.println("Stop method called - The vehicle is stopped");
    }

    protected int getCurrentSpeed() {
        return currentSpeed;
    }

    protected int getCurrentDirection() {
        return currentDirection;
    }
}