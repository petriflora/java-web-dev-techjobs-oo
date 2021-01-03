package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;


    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    // DONE: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // DONE: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        if (jobDetailsNotProvided()) {
            return ("OOPS! This job does not seem to exist.");
        } return ("\n" + "Job ID: " + this.getId() +
                '\n' + "Job Name: " + this.getName() +
                '\n' + "Employer: " + this.getEmployer() +
                '\n' + "Location: " + this.getLocation() +
                '\n' + "Position Type: " + this.getPositionType() +
                '\n' + "Core Competency: " + this.getCoreCompetency() + '\n');
    }

    //helper function magic
    private static String valueIsEmpty(String valueToCheck) {
       if (valueToCheck == "") {
            return "Data not available";
        } return valueToCheck;
    }

    private  Boolean jobDetailsNotProvided() {
        if (this.name == ""
                && this.employer.getValue() == ""
                && this.location.getValue() == ""
                && this.positionType.getValue() == ""
                && this.coreCompetency.getValue() == "") {
            return true;
        } return false;
    }
    // DONE: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return valueIsEmpty(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployer() {
        return valueIsEmpty(employer.getValue());
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getLocation() {
        return valueIsEmpty(location.getValue());
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPositionType() {
        return valueIsEmpty(positionType.getValue());
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public String getCoreCompetency() {
        return valueIsEmpty(coreCompetency.getValue());
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
