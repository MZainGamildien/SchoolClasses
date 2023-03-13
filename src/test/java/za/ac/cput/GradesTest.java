package za.ac.cput;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.jupiter.api.Assertions.*;

class GradesTest {
    private Class mathClass;
    private Student johnDoe;
    private Student janeDoe;

    @Before
    public void setUp() {
        mathClass = new Class("Math 101","Teacher","none");
        johnDoe = new Student("John", "Doe",10,1);
        janeDoe = new Student("Jane", "Doe",9,2);
    }

    @Test
    public void testObjectEquality() {
        Grades grades1 = new Grades(mathClass, johnDoe, 80.0);
        Grades grades2 = new Grades(mathClass, johnDoe, 80.0);
        assertEquals(grades1, grades2);
    }

    @Test
    public void testObjectIdentity() {
        Grades grades1 = new Grades(mathClass, johnDoe, 80.0);
        Grades grades2 = new Grades(mathClass, johnDoe, 80.0);
        assertNotSame(grades1, grades2);
    }

    @Test
    public void testFailingTest() {
        Grades grades = new Grades(mathClass, johnDoe, 80.0);
        assertEquals(90.0, grades.getGrade(), 0.01); // This test is designed to fail
    }

    @Test(timeout = 1000)
    public void testTimeout() {
        Grades grades = new Grades(mathClass, johnDoe, 80.0);
        while(true); // This test will run indefinitely without a timeout
    }

    @Ignore("Disabled for now")
    @Test
    public void testDisabled() {
        Grades grades = new Grades(mathClass, janeDoe, 90.0);
        assertEquals(90.0, grades.getGrade(), 0.01);
    }
}