package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class JobTest {

    Job test_job1;
    Job test_job2;
    Job test_job3;
    Job test_job4;

    @Before
    public void createJobObject1() { test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    test_job2 = new Job( "", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    test_job3 = new Job( "Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
    test_job4 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));}

//    @Test //add to configure runtime environment, comment out before pushing to Git
//    public void emptyTest() {
//        assertEquals(true, true);
//    }

    @Test
    //DONE: testSettingJobId: Use assertEquals, assertTrue, or assertFalse to test that the ID values
    // for the two objects are NOT the same and differ by 1.
    public void testSettingJobId() {
        assertTrue( test_job4.getId() - test_job3.getId() == 1);
    }

    @Test
    //DONE: define a test called testJobConstructorSetsAllFields. Declare and initialize a new Job object
    public void testJobConstructorSetsAllFields() {
        assertTrue(test_job1 != null);
        assertSame("Product tester", test_job1.getName());
        assertSame("ACME", test_job1.getEmployer());
        assertSame("Desert", test_job1.getLocation());
        assertSame("Quality control", test_job1.getPositionType());
        assertSame("Persistence", test_job1.getCoreCompetency());
    }

    @Test
    //DONE: verify that two objects with the same values but different IDs do not evaluate to equal
    public void testJobsForEquality() {
        assertTrue( !test_job3.equals(test_job4));
    }

    @Test
    //DONE: When passed a Job object, it should return a string that contains
    // a blank line before and after the job information. The string should contain
    // a label for each field, followed by the data stored in that field. Each field should be
    // on its own line. If a field is empty, the method should add, “Data not available”
    // after the label. (Bonus) If a Job object ONLY contains data for the id field, the method
    // should return, “OOPS! This job does not seem to exist.”
    public void testToStringMethod() {
        assertEquals(test_job2.toString(), "OOPS! This job does not seem to exist.");
        assertEquals(test_job3.toString(), ("\n" + "Job ID: " + test_job3.getId() +
                '\n' + "Job Name: " + test_job3.getName() +
                '\n' + "Employer: " + test_job3.getEmployer() +
                '\n' + "Location: " + test_job3.getLocation() +
                '\n' + "Position Type: " + test_job3.getPositionType() +
                '\n' + "Core Competency: " + test_job3.getCoreCompetency() + '\n'));
    }
    @Test
    public void testToStringMethodWithEmptyName() {
        assertEquals(test_job3.toString(), ("\n" + "Job ID: " + test_job3.getId() +
                '\n' + "Job Name: " + test_job3.getName() +
                '\n' + "Employer: " + test_job3.getEmployer() +
                '\n' + "Location: " + test_job3.getLocation() +
                '\n' + "Position Type: " + test_job3.getPositionType() +
                '\n' + "Core Competency: " + test_job3.getCoreCompetency() + '\n'));
    }

}

