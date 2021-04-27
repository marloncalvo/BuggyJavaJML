package ArjaE.Time.bug53.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		Time time = new Time(5, 10, 12);
		Time a = new Time(4, 18, 29);
		Time b = new Time(3, 58, 21);
		Time diff = time.difference(a, b);
		assertEquals(0, diff.getHour());
		assertEquals(20, diff.getMinute());
		assertEquals(8, diff.getSecond());
	}

	@Test
	void test0() {
		Time time = new Time(5, 10, 12);
		Time a = new Time(22, 58, 46);
		Time b = new Time(16, 5, 39);
		Time diff = time.difference(a, b);
		assertEquals(6, diff.getHour());
		assertEquals(53, diff.getMinute());
		assertEquals(7, diff.getSecond());
	}

    @Test
    void test1() {
        fail("The function equals() is not testable for this case");
    }

    @Test
    void test2() {
        fail("The function equals() is not testable for this case");
    }
    
    @Test
    void test3() {
        fail("The function trustedDifference() is not testable for this case");
    }
    
}
