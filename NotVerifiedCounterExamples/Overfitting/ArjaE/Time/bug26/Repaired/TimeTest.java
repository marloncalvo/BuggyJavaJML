package ArjaE.Time.bug26.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		Time time = new Time(10, 50, 0);
		time.decr();
		assertEquals(10, time.getHour());
		assertEquals(49, time.getMinute());
		assertEquals(59, time.getSecond());
	}

	@Test
	void test0() {
		Time time = new Time(9, 59, 0);
		time.decr();
		assertEquals(9, time.getHour());
		assertEquals(58, time.getMinute());
		assertEquals(59, time.getSecond());
	}
	
	@Test
	void test1() {
		Time time = new Time(13, 5, 10);
		assertFalse(time.isTimeZero());
	}
	
	@Test
	void test2() {
		Time time = new Time(17, 17, 21);
		assertFalse(time.isTimeZero());
	}
	
	@Test
	void test3() {
		Time time = new Time(17, 5, 21);
		assertFalse(time.isTimeZero());
	}
}
