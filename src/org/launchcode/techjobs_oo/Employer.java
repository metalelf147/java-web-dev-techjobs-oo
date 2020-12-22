package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer {
    private int id;
    private static int nextId = 1;
    private String value;

    public Employer() {
        id = nextId;
        nextId++;
    }

    public Employer(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {

        return value;
    }

    @Override
    public boolean equals(Object e) {  // Two objects are equal if they have the same id.
        if (this == e) return true;
        if (!(e instanceof Employer)) return false;
        Employer employer = (Employer) e;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {

        return id;
    }

    public String getValue() {

        return value;
    }

    public void setValue(String value) {

        this.value = value;
    }
}
