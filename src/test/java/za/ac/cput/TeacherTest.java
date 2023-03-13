package za.ac.cput;

import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;


public class TeacherTest{
    @Test
    public void equalityTest() {
        Teacher t1 = new Teacher("Mr Naidoo", "Applications Development Practice", 30);
        Teacher t2 = new Teacher("Mr Naidoo", "Applications Development Practice", 30);
        assertEquals(t1, t2);
    }

    @Test
    public void identityTest() {
        Teacher t1 = new Teacher("Mr Burger", "Applications Development Fundamentals", 100);
        Teacher t2 = t1;
        assertSame(t1, t2);
    }

    @Test
    public void failingTest() {
        Teacher t1 = new Teacher("Mr Naidoo", "Applications Development Practice", 30);
        Teacher t2 = new Teacher("Mr Burger", "Applications Development Fundamentals", 100);
        assertEquals(t1, t2);
    }
    @Test
    @Timeout(5)
   public void timeoutTest() throws InterruptedException {
        TimeUnit.SECONDS.sleep(4);

    }
    @Ignore("Disabled until further notice")
    @Disabled
    @Test
   public void disablingTest(){
        System.out.println("Hi there");
    }



}




