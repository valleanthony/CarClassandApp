package com.company;

public class Driver extends Person {

    private String yearsDriving;
    private String hasAnId;

    public String getYearsDriving() {
        return yearsDriving;
    }

    public void setYearsDriving(String yearsDriving) {
        this.yearsDriving = yearsDriving;
    }

    public String getHasAnId() {
        return hasAnId;
    }

    public void setHasAnId(String hasAnId) {
        this.hasAnId = hasAnId;
    }

    public Driver(String name, String age, String yearsDriving, String hasAnId) {
        super(name, age);
        this.yearsDriving = yearsDriving;
        this.hasAnId = hasAnId;
    }

    public Driver() {
    }

}
