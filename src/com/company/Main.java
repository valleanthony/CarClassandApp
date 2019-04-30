package com.company;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car("Blue","Honda");
        Car c2 = new Car("Red","Toyota");
        Car c3 =new Car("Red","Ford");


        System.out.println("The "+c1.getColor() +" "+ c1.getModel() + c1.starting());
        System.out.println("The "+c2.getColor() +" "+ c2.getModel() + c2.starting());
        System.out.println("The "+ c1.getColor() +" "+ c1.getModel() + c1.accelerate() );
        System.out.println("The "+ c1.getColor() +" "+ c1.getModel() + c1.setSpeed() );
        System.out.println("The "+ c1.getColor() +" "+ c1.getModel() + c1.stopped());


        c1.setWheels("3 wheels");
        System.out.println(c1.getWheels());



    }
}
