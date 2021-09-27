/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoylinTest {
    Roylin r;

    @Before
    public void setUp() throws Exception {
        r = new Roylin();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("YESSSS I 4.0 this test!", r.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10, r.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        r.upgradeSpeed();
        assertEquals(2, r.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        r.downgradeSpeed();
        assertEquals(9, r.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, r.getPrice());
    }


}