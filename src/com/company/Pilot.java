package com.company;

public class Pilot extends Person {
    private String pilotSchoolName;
    private String yearsFlying;
    private String employer;

    public String getPilotSchoolName() {
        return pilotSchoolName;
    }

    public void setPilotSchoolName(String pilotSchoolName) {
        this.pilotSchoolName = pilotSchoolName;
    }

    public String getYearsFlying() {
        return yearsFlying;
    }

    public void setYearsFlying(String yearsFlying) {
        this.yearsFlying = yearsFlying;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public Pilot() {
    }

    public Pilot(String name, String age, String pilotSchoolName, String yearsFlying, String employer) {
        super(name, age);
        this.pilotSchoolName = pilotSchoolName;
        this.yearsFlying = yearsFlying;
        this.employer = employer;
    }


}
