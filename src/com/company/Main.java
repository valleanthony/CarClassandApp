package com.company;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard= new Scanner(System.in);
        ArrayList<Car> allcars = new ArrayList<Car>();

        // Making instances:
        Car c1 = new Car("Blue","Honda");
        Car c2 = new Car("Red","Toyota");
        Car c3 =new Car("Red","Ford");



        System.out.println("Please add a car:" );
        System.out.println("What color is your car?");
        String tempColor = keyboard.nextLine();
        System.out.println("What brand?");
        String tempModel = keyboard.nextLine();
        // User Making a new instance
        Car c4 = new Car(tempColor,tempModel);

        //Adding to a arraylist:

        allcars.add(c1);
        allcars.add(c2);
        allcars.add(c3);
        allcars.add(c4);

        for (Car car:allcars){
            System.out.println("This is a " + car.getColor()+ " "+ car.getModel());
        }




//        System.out.println("The "+c1.getColor() +" "+ c1.getModel() + c1.starting());
//        System.out.println("The "+c2.getColor() +" "+ c2.getModel() + c2.starting());
//        System.out.println("The "+ c1.getColor() +" "+ c1.getModel() + c1.accelerate() );
//        System.out.println("The "+ c1.getColor() +" "+ c1.getModel() + c1.setSpeed() );
//        System.out.println("The "+ c1.getColor() +" "+ c1.getModel() + c1.stopped());

    }
}
