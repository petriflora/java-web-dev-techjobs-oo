package org.launchcode.techjobs_oo;

public class CoreCompetency extends JobField {
    private int coreCompetencyId;

    //constructor - for value only
    public CoreCompetency(String value) {
        super(value);
    }

    @Override
    public boolean equals(Object o) { // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return id == that.id;
    }

    // Getters and Setters:

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return coreCompetencyId = this.getId();
    }

}
