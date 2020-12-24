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

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
//

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object j) {
        if (this == j) return true;
        if (!(j instanceof Job)) return false;
        Job job = (Job) j;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        if (this.name == null || this.name.isEmpty()) {
            return "ID: " + id + " \n" + "Name: Data not available" + " \n" + "Employer: " + employer + " \n" + "Location: " + location + " \n" + "Position type: " + positionType + " \n" + "Core competency: " + coreCompetency + " \n";
        }
        if (this.employer == null || this.employer.getValue() == "") {
            return "ID: " + id + " \n" + "Name: " + name + " \n" + "Employer: Data not available" + " \n" + "Location: " + location + " \n" + "Position type: " + positionType + " \n" + "Core competency: " + coreCompetency + " \n";
        }
        if (this.location == null || this.location.getValue() == "") {
            return "ID: " + id + " \n" + "Name: " + name + " \n" + "Employer: " + employer + " \n" + "Location: Data not available" + " \n" + "Position type: " + positionType + " \n" + "Core competency: " + coreCompetency + " \n";
        }
        if (this.positionType == null || this.positionType.getValue() == "") {
            return "ID: " + id + " \n" + "Name: " + name + " \n" + "Employer: " + employer + " \n" + "Location: " + location + " \n" + "Position type: Data not available" + " \n" + "Core competency: " + coreCompetency + " \n";
        }
        if (this.coreCompetency == null || this.coreCompetency.getValue() == "") {
            return "ID: " + id + " \n" + "Name: " + name + " \n" + "Employer: " + employer + " \n" + "Location: " + location + " \n" + "Position type: " + positionType + " \n" + "Core competency: Data not available" + " \n";
        } else {
            return "ID: " + id + " \n" + "Name: " + name + " \n" + "Employer: " + employer + " \n" + "Location: " + location + " \n" + "Position type: " + positionType + " \n" + "Core competency: " + coreCompetency + " \n";
        }
    }
}
