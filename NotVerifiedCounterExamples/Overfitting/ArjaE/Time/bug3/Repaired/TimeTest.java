package ArjaE.Time.bug3.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

    @Test
    void test() {
        Time time = new Time();
        assertDoesNotThrow(() -> {
            time.setSecond(25);
        });
        assertEquals(25, time.getSecond());
    }

    @Test
    void test1() {
        Time time = new Time();
        assertDoesNotThrow(() -> {
            time.setSecond(20);
        });
        assertEquals(20, time.getSecond());
    }
    
    @Test
    void test2() {
        Time time = new Time();
        assertDoesNotThrow(() -> {
            time.setSecond(31);
        });
        assertEquals(31, time.getSecond());
    }
    
    @Test
    void test3() {
        fail("Cannot test timer()");
    }
}
