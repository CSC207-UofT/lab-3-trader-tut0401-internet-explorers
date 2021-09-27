import org.junit.*;

import static org.junit.Assert.*;


public class LionTest {
    Lion l;

    @Before
    public void setUp() throws Exception {
        l = new Lion();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("ROAAARRRR", l.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10, l.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        l.upgradeSpeed();
        assertEquals(20, l.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        l.downgradeSpeed();
        assertEquals(19, l.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1000000, l.getPrice());
    }

    @Test(timeout = 50)
    public void TestGetFavFood() {
        assertEquals("Andy", l.gEtfAvFoOd());

    }
}
