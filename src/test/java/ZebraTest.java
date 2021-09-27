/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class ZebraTest {
    Zebra h;

    @Before
    public void setUp() throws Exception {
        z = new Zebra();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("wouuh wouuuwah whouuuuwouh wouHIIII", h.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(Integer, h.getPrice());
    }

}