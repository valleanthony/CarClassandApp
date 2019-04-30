package com.company;

public class Vehicle {

    private String wheels;
    private String engine;
    private boolean fourxfour;

    public Vehicle(){
        System.out.println("A car has been created");
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

    public String speedup(){

        return "i am going fast";
    }


    public String setWheels() {
        return wheels;
    }
}




