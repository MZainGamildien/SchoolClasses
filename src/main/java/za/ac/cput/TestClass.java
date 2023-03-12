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
        Classes c1 = new Classes("English", "Mr. Johnson", "brad");
        Classes c2 = new Classes("English", "Mr. Johnson", "brad");
        assertEquals(c1, c2);
    }
@Test
    public void testClassIdentity() {
        Classes c1 = new Classes("English", "Mr. Naidoo", "BabaGworl");
        Classes c2 = c1;
        assertSame(c1, c2);
    }
    @Test
    public void testClassTest() {
        Classes c1 = new Classes("Math", "Mr. Johnson", "Jack");
        Classes c2 = new Classes("Math", "Mr. Johnson", "Daniels");
        assertEquals(c1, c2);
    }

}
