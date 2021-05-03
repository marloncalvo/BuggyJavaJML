package ArjaE.Time.bug4.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

    @Test
    void test() {
        Time time = new Time();
        assertThrows(IllegalArgumentException.class, () -> {
            time.setSecond(-1);
        });
    }
    
    @Test
    void test1() {
        Time time = new Time();
        assertThrows(IllegalArgumentException.class, () -> {
            time.setSecond(60);
        });
    }
    
    @Test
    void test2() {
        Time time = new Time();
        assertThrows(IllegalArgumentException.class, () -> {
            time.setSecond(60);
        });
    }

    @Test
    void test3() {
        Time time = new Time(-1, -1, -1);
        assertDoesNotThrow(() -> {
            time.setSecond(59);
        });
        assertEquals(59, time.getSecond());
    }
    
    @Test
    void test4() {
    	fail("Timer is untestable");
    }
}
