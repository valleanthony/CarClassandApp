package com.company;

public abstract class Vehicle {

    private String wheels;
    private String engine;
    private boolean fourxfour;

    public Vehicle(){

    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isFourxfour() {
        return fourxfour;
    }

    public void setFourxfour(boolean fourxfour) {
        this.fourxfour = fourxfour;
    }

    public String setWheels() {
        return wheels;
    }

    abstract String speedup();
    abstract String run();
    abstract String stop();
    abstract String accelerate();


}




