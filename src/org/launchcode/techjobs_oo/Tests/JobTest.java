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
//
//    Job job1;
//    Job job2;
//    Job job3;

    @Before
    public void makeJobs(){
        Job job1 = new Job();
        Job job2 = new Job();
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertTrue(job1.getId() != job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer());
//        assertEquals("Desert", job3.getLocation());
//        assertEquals("Quality control", job3.getPositionType());
//        assertEquals("Persistence", job3.coreCompetency());
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
