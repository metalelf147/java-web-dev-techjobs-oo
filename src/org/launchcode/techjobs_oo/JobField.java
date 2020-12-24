package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    @Override
    public String toString() {

        return value;
    }

    @Override
    public boolean equals(Object f) {  // Two objects are equal if they have the same id.
        if (this == f) return true;
        if (!(f instanceof JobField)) return false;
        JobField jobField = (JobField) f;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId());
    }



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
