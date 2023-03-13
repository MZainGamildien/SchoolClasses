/**
 * StudentTest.java
 * This is the Student test class
 * @author Ferdouz Allie
 * 214038033
 * 12 March 2023
 */

package za.ac.cput;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
public class StudentTest {
    @Test
public void studentTestEquality(){
    Student s1 = new Student("Tod", "Abraham",22,7);
    Student s2 = new Student("Tod", "Abraham",22,7);
    assertEquals(s1, s2);
}
@Test
public void studentTestIdentity(){
    Student s1 = new Student("Robert", "Forbes",24,5);
    Student s2 = s1;
    assertSame(s1,s2);

}
@Test
public void studentTestFailing(){
    Student s1 = new Student("Hanna","Daniels", 23, 7);
    Student s2 = new Student("Henry","Ford", 23, 7);
    assertEquals(s1, s2);

   }
   @Test
   @Timeout(11)
   public void testWithTimeout() throws InterruptedException{
       TimeUnit.SECONDS.sleep(10);

   }
   @Ignore("Temporarily disabled...")
   @Test
public void temporarilyDisabledTest(){
        System.out.println("Testing...");
}
}