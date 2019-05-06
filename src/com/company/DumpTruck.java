package com.company;

public class DumpTruck extends Vehicle {
    private String limitTons;

    @Override
    String accelerate() {
        return "Speeding up!";
    }

    @Override
    String stop() {
        return "Truck has stopped";
    }

    @Override
    String run() {
        return null;
    }

    @Override
    String speedup() {
        return null;
    }
}
