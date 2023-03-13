import org.junit.*;
import za.ac.cput.Grades;

import static org.junit.Assert.*;

public class testGrades {

    // Set up test data
    private Class mathClass;
    private Student johnDoe;
    private Student janeDoe;

    @Before
    public void setUp() {
        mathClass = new Class("Math 101");
        johnDoe = new Student("John", "Doe");
        janeDoe = new Student("Jane", "Doe");
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
