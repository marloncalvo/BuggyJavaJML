package ArjaE.Time.bug24.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		Time time = new Time(23, 37, 25);
		assertEquals(85_045, time.convertToSeconds());
	}

	@Test
	void test0() {
		Time time = new Time(21, 20, 2);
		assertEquals(76802, time.convertToSeconds());
	}
	
	@Test
	void test1() {
		Time time = new Time(17, 5, 57);
		assertEquals(76802, time.convertToSeconds());
	}
	
	@Test
	void test2() {
		Time time = new Time(5, 37, 1);
		assertEquals(5, time.getHour());
		assertEquals(37, time.getMinute());
		assertEquals(0, time.getSecond());
	}
	
	@Test
	void test3() {
		Time time = new Time(0, 0, 1);
		assertEquals(0, time.getHour());
		assertEquals(0, time.getMinute());
		assertEquals(0, time.getSecond());
	}
	
}
