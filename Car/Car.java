/*
 * File: Car.java
 * Student: Abeer Fatima (Seat No: BS25110006007)
 */
public class Car {
    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;
    
    private int fuelLevel;
    private boolean turboMode;

    public Car() {
        this.brand = "Unknown";
        this.color = "Unpainted";
        this.speed = 0;
        this.engineOn = false;
        this.fuelLevel = 100;
        this.turboMode = false;
    }

    public void setDetails(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void startEngine() {
        if (this.fuelLevel <= 0) {
            System.out.println(this.brand + ": Cannot start. Out of fuel!");
            return;
        }
        this.engineOn = true;
        System.out.println(this.brand + " engine started.");
    }

    public void stopEngine() {
        this.speed = 0;
        this.engineOn = false;
        this.turboMode = false;
        System.out.println(this.brand + " engine stopped. Speed reset to zero.");
    }

    public void accelerate() {
        if (!this.engineOn) {
            System.out.println(this.brand + ": Cannot accelerate! Engine is OFF.");
            return;
        }
        this.speed += 20;
        this.fuelLevel -= 5;
        System.out.println(this.brand + " accelerated. Current Speed: " + this.speed + " km/h");
    }

    public void brake() {
        this.speed -= 15;
        if (this.speed < 0) this.speed = 0;
        System.out.println(this.brand + " applied brakes. Current Speed: " + this.speed + " km/h");
    }

    public void enableTurbo() {
        if (this.engineOn && this.speed > 30) {
            this.turboMode = true;
            this.speed += 50;
            System.out.println(this.brand + ": TURBO MODE ACTIVATED! Speed boosted to " + this.speed + " km/h!");
        } else {
            System.out.println(this.brand + ": Turbo failed! Must be engine ON and speed > 30 km/h.");
        }
    }

    public void displayState() {
        System.out.println("--- " + this.brand + " State ---");
        System.out.println("Color: " + this.color);
        System.out.println("Speed: " + this.speed + " km/h");
        System.out.println("Engine On: " + this.engineOn);
        System.out.println("Fuel Level: " + this.fuelLevel + "%");
        System.out.println("Turbo Mode: " + this.turboMode);
        System.out.println();
    }
}