package org.launchcode.techjobs_oo.Tests;
import org.launchcode.techjobs_oo.Job;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.junit.Assert;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;



public class JobTest {

    Job job1;
    Job job2;
    Job job3;
    Job job4;
    Job job5;

    @Before
    public void makeTestJobs(){
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job4 = new Job("Cat cafe owner", new Employer ("CATSLIVING"), new Location ("Mountains"), new PositionType("Care for cats"), new CoreCompetency("Patience"));
        job5 = new Job("Cat cafe owner", new Employer ("CATSLIVING"), new Location ("Mountains"), new PositionType("Care for cats"), new CoreCompetency("Patience"));
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
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        assertEquals(job4.getId(), job5.getId());
    }



}
//
//
////    Use assertEquals, assertTrue, or assertFalse to test that the ID values for the
////    two objects are NOT the same and differ by 1.
////
////    Run the test to verify that your Job() constructor correctly assigns ID numbers.
////
////    If the test doesn’t pass, what should be your first thought?
////
////            “Drat! I need to fix the unit test.”
////            “Drat! I need to fix my Job() constructor code.”
//
//
//}
