import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class group1 {

    @Test
    void testOne() {
        assertTrue(true);
    }

    @Test
    void testTwo() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void testThree() {
        assertTrue(false);
    }

    @Test
    @Disabled ("need time")
    void testFour() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void testFive() {
        assertTrue(true);
    }
}
