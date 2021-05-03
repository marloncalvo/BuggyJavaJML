package ArjaE.Time.bug15.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		Time start = new Time(23, 37, 25);
		Time end = new Time(17, 59, 0);
		Time diff = start.difference(start, end);
		assertEquals(5, diff.getHour());
		assertEquals(38, diff.getMinute());
		assertEquals(25, diff.getSecond());
	}
	
	@Test
	void test0() {
		Time start = new Time(19, 55, 46);
		Time end = new Time(5, 59, 30);
		Time diff = start.difference(start, end);
		assertEquals(13, diff.getHour());
		assertEquals(58, diff.getMinute());
		assertEquals(16, diff.getSecond());
	}
	
	@Test
	void test1() {
		Time start = new Time(0, 27, 13);
		Time end = new Time(16, 59, 10);
		Time diff = start.difference(start, end);
		assertEquals(16, diff.getHour());
		assertEquals(31, diff.getMinute());
		assertEquals(57, diff.getSecond());
	}

	@Test
	void test2() {
		Time a = new Time(8, 5, 47);
		Time b = new Time(9, 5, 46);
		assertNotEquals(a, b);
	}
	
	@Test
	void test3() {
		Time time = new Time(13, 0, 35);
		assertEquals(0, time.getMinute());
	}
}
