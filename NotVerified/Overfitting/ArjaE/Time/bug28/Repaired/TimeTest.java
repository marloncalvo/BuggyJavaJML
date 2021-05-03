package ArjaE.Time.bug28.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		Time time = new Time(1, 0, 0);
		time.decr();
		assertEquals(0, time.getHour());
		assertEquals(59, time.getMinute());
		assertEquals(59, time.getSecond());
	}

	@Test
	void test0() {
		Time time = new Time(0, 2, 0);
		time.decr();
		assertEquals(0, time.getHour());
		assertEquals(1, time.getMinute());
		assertEquals(59, time.getSecond());
	}
	
	@Test
	void test1() {
		Time time = new Time(14, 8, 0);
		time.decr();
		assertEquals(14, time.getHour());
		assertEquals(7, time.getMinute());
		assertEquals(59, time.getSecond());
	}
	
	@Test
	void test2() {
		Time time = new Time(13, 5, 0);
		assertFalse(time.isTimeZero());
	}
	
	@Test
	void test3() {
		Time time = new Time(17, 17, 21);
		assertFalse(time.isTimeZero());
	}
	
	@Test
	void test4() {
		Time time = new Time(17, 5, 21);
		assertFalse(time.isTimeZero());
	}
	
	@Test
	void test5() {
		fail("unable to test timer");
	}
}
