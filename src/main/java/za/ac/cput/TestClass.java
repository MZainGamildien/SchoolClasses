/**
 * TestClass.java
 * This is the Class used for doing testing on the CLasses Pojo
 * @author Carlo Joseph
 * 12 March 2023
 */
package za.ac.cput;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestClass {
    public void testOClassEquality() {
        Class c1 = new Class("English", "Mr. Johnson", "brad");
        Class c2 = new Class("English", "Mr. Johnson", "brad");
        assertEquals(c1, c2);
    }
@Test
    public void testClassIdentity() {
        Class c1 = new Class("English", "Mr. Naidoo", "BabaGworl");
        Class c2 = c1;
        assertSame(c1, c2);
    }
    @Test
    public void testClassTest() {
        Class c1 = new Class("Math", "Mr. Johnson", "Jack");
        Class c2 = new Class("Math", "Mr. Johnson", "Daniels");
        assertEquals(c1, c2);
    }

}
