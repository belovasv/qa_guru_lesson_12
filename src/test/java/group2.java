import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class group2 {

    @Test
    void testOne() {
        assertTrue(true);
    }

    @Test
    void testSix() {
        assertTrue(true);
    }

    @Test
    void testSeven() {
        assertTrue(true);
    }

    @Test
    void testEight() {
        assertTrue(true);
    }

    @Test
    void testTwo() {
        assertTrue(false);
    }

    @Test
    void testThree() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void testFour() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void testFive() {
        assertTrue(true);
    }
}
