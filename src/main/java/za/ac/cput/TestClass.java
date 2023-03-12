package za.ac.cput;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestClass {
    public void testOClassEquality() {
        String[] students1 = {"Carlo", "Johnny", "Goodie"};
        String[] students2 = {"Carlo", "Johnny", "Goodie"};
        Classes c1 = new Classes("English", "Mr. Johnson", "brad");
        Classes c2 = new Classes("English", "Mr. Johnson", "brad");
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
