package za.ac.cput;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestClass {
    public void testOClassEquality() {
        String[] students1 = {"Alice", "Bob", "Charlie"};
        String[] students2 = {"Alice", "Bob", "Charlie"};
        Classes c1 = new Classes("Math", "Mr. Johnson", "brad");
        Classes c2 = new Classes("Math", "Mr. Johnson", "brad");
        assertEquals(c1, c2);
    }
@Test
    public void testClassIdentity() {
        String[] students1 = {"Jennie", "Jisoo", "Rose"};
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
