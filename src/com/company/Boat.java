package com.company;

public class Boat extends Vehicle{

    private String Boatname;

    @Override
    String run() {
        return "Boat engine running";
    }

    @Override
    String accelerate() {
        return null;
    }

    @Override
    String speedup() {
        return null;
    }

    @Override
    String stop() {
        return null;
    }
}
