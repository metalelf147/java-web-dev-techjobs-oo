package org.launchcode.techjobs_oo.Tests;
import org.launchcode.techjobs_oo.Job;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;



public class JobTest {

    Job job1;
    Job job2;
    Job job3;
    Job job4;
    Job job5;
    Job job6;

    @Before
    public void makeTestJobs() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job4 = new Job("Cat cafe owner", new Employer("CATSLIVING"), new Location("Mountains"), new PositionType("Care for cats"), new CoreCompetency("Patience"));
        job5 = new Job("Cat cafe owner", new Employer("CATSLIVING"), new Location("Mountains"), new PositionType("Care for cats"), new CoreCompetency("Patience"));
        job6 = new Job("", new Employer("CATSLIVING"), new Location("Mountains"), new PositionType("Care for cats"), new CoreCompetency("Patience"));

    }

    @Test
    public void testSettingJobId() {
        assertTrue(job1.getId() != job2.getId());

    }

    @Test
    public void testIfInstanceOfJob() {
        assertEquals(true, job3 instanceof Job);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertEquals(job4.getId(), job5.getId());
    }

    @Test
    public void startsWithSpace() {
        job3.toString().startsWith(" ");
    }

    @Test
    public void endsWithSpace(){
        job3.toString().endsWith(" ");
    }

    @Test
    public void includesLabels(){
        job3.toString().contains("ID");
        job3.toString().contains("Name");
        job3.toString().contains("Employer");
        job3.toString().contains("Location");
        job3.toString().contains("Position type");
        job3.toString().contains("Core competency");
    }

    @Test
    public void isEmpty(){
        String testStr = "ID: 6 \n" +
                "Name: Data not available \n" +
                "Employer: CATSLIVING \n" +
                "Location: Mountains \n" +
                "Position type: Care for cats \n" +
                "Core competency: Patience \n";
        assertEquals(job6.toString(), testStr);
    }

}