import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AkshayTest {

    Akshay a;

    @Before
    public void setUp() throws Exception {
        a = new Horse();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("rawr i'm akshay!", a.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1000, a.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        a.upgradeSpeed();
        assertEquals(16000, a.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        a.downgradeSpeed();
        assertEquals(0, a.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1, a.getPrice());
    }

}
