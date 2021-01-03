package org.launchcode.techjobs_oo;

public class Location extends JobField {
    private int locationId;

    //constructor - for value only
    public Location(String value) {
        super(value);
    }

    @Override
    public boolean equals(Object o) { // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
    }

    // Getters and Setters:

    public void setValue(String value) {
        this.value = value;
    }

    public int getID() {
        return locationId = this.getId();
    }
}
