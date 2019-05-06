package com.company;

public class Captains extends Person {
    private String ownsABoat;
    private String nameOfBoat;
    private String numberOfDeckHands;

    public String getOwnsABoat() {
        return ownsABoat;
    }

    public void setOwnsABoat(String ownsABoat) {
        this.ownsABoat = ownsABoat;
    }

    public String getNameOfBoat() {
        return nameOfBoat;
    }

    public void setNameOfBoat(String nameOfBoat) {
        this.nameOfBoat = nameOfBoat;
    }

    public String getNumberOfDeckHands() {
        return numberOfDeckHands;
    }

    public void setNumberOfDeckHands(String numberOfDeckHands) {
        this.numberOfDeckHands = numberOfDeckHands;
    }

    public Captains() {
    }

    public Captains(String name, String age, String ownsABoat, String nameOfBoat, String numberOfDeckHands) {
        super(name, age);
        this.ownsABoat = ownsABoat;
        this.nameOfBoat = nameOfBoat;
        this.numberOfDeckHands = numberOfDeckHands;
    }
}
