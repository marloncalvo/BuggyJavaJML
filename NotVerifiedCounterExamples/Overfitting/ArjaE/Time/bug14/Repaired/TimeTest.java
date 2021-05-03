package ArjaE.Time.bug14.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		Time a = new Time(9, 12, 46);
		Time b = new Time(8, 13, 47);
		assertNotEquals(a, b);
	}

	@Test
	void test0() {
		Time a = new Time(8, 12, 46);
		Time b = new Time(8, 12, 46);
		assertEquals(a, b);
	}
	
	@Test
	void test1() {
		int h = 13;
		int m = 35;
		int s = 37;
		Time time = new Time(h, m, s);
		assertEquals(h, time.getHour());
	}
	
	@Test
	void test2() {
		int h = 13;
		int m = 35;
		int s = 0;
		Time time = new Time(h, m, s);
		assertEquals(s, time.getSecond());
	}

}
