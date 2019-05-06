package com.company;

public class Car extends Vehicle {

    private String Color;
    private String Model;

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public Car() {
    }

    public Car(String color, String model) {
        Color = color;
        Model = model;
    }


//    @Override
//    public Vehicle(){
//
//
//    }


    public String accelerate(){



       return " is Accelerating";
    }
    public String setSpeed(){

        return "is going 90 MPH";
    }

    public String starting(){
       return (" is starting");
    }

    public  String stop(){
        return " Car has stopped";
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
