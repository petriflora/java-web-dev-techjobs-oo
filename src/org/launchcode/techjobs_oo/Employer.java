package org.launchcode.techjobs_oo;

public class Employer extends JobField {
    private int employerId;

    //constructor - for value only
    public Employer(String value) {
        super(value);
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    // Getters and Setters:

    public void setValue(String value) {
        this.value = value;
    }

    public int getID() {
        return employerId = this.getId();
    }
}
