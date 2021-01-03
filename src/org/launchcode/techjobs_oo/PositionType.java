package org.launchcode.techjobs_oo;

public class PositionType extends JobField {
    private int positionTypeId;

    //constructor - for value only
    public PositionType(String value) {
        super(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType that = (PositionType) o;
        return id == that.id;
    }

    // Getters and Setters:

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return positionTypeId = this.getId();
    }
}
