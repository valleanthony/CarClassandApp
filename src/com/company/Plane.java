package com.company;

public class Plane extends Vehicle {
    private String highestAltitude;

    @Override
    String run() {
        return "The Plane is running";
    }

    @Override
    String accelerate() {
        return null;
    }

    @Override
    String stop() {
        return null;
    }

    @Override
    String speedup() {
        return null;
    }
}
