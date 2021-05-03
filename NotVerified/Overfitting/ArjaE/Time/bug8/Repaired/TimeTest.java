package ArjaE.Time.bug8.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

    @Test
    void test() {
        Time time = new Time(-1, -1, -1);
        assertThrows(IllegalArgumentException.class, () -> {
            time.setMinute(-1);
        });
    }

    @Test
    void test0() {
        Time time = new Time(-1, -1, -1);
        assertThrows(IllegalArgumentException.class, () -> {
            time.setMinute(60);
        });
    }
    
    @Test
    void test1() {
        Time time = new Time(-1, -1, -1);
        assertDoesNotThrow(() -> {
            time.setMinute(59);
        });
        assertEquals(59, time.getMinute());
    }
    
    @Test
    void test2() {
        Time time = new Time(-1, -1, -1);
        assertThrows(IllegalArgumentException.class, () -> {
            time.setMinute(60);
        });
    }
    
}
