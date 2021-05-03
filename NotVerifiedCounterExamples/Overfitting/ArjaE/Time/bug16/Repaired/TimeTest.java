package ArjaE.Time.bug16.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		Time start = new Time(0, 0, 0);
		Time end = new Time(21, 13, 58);
		Time diff = start.difference(start, end);
		assertEquals(21, diff.getHour());
		assertEquals(13, diff.getMinute());
		assertEquals(58, diff.getSecond());
	}

	@Test
	void test0() {
		Time a = new Time(9, 13, 47);
		Time b = new Time(8, 12, 46);
		fail("Equals is a false negative case");
		assertNotEquals(a, b);
	}
	
	@Test
	void test1() {
		int h = 0;
		int m = 37;
		int s = 35;
		Time time = new Time(h, m, s);
		assertEquals(h, time.getHour());
	}
}
