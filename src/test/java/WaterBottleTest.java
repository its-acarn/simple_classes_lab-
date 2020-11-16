import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drink() {
        waterBottle.getDrink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void isEmpty() {
        waterBottle.emptyWaterBottle();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void isFilled() {
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}
