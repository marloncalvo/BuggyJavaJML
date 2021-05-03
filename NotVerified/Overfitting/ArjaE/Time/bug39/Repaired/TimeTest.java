package ArjaE.Time.bug39.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		Time a = new Time(0, 5, 29);
		Time b = new Time(0, 5, 12);
		Time diff = a.difference(a, b);
		assertEquals(0, diff.getHour());
		assertEquals(0, diff.getMinute());
		assertEquals(17, diff.getSecond());
	}

	@Test
	void test0() {
		fail("Cannot generate for equals() due to no value");
	}

	@Test
	void test1() {
		Time time = new Time(5, 47, 0);
		Time start = new Time(5, 46, 37);
		assertTrue(time.later_than(start));
	}

	@Test
	void test2() {
		Time time = new Time(0, 0, 37);
		Time start = new Time(18, 13, 51);
		Time end = new Time(17, 12, 50);
		int sel = 4;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(1, res.getHour());
		assertEquals(1, res.getMinute());
		assertEquals(1, res.getSecond());
	}

	@Test
	void test3() {
		Time time = new Time(1, 17, 45);
		Time __timeOld = new Time(1, 17, 45);
		Time start = new Time(17, 20, 50);
		Time end = new Time(17, 20, 50);
		Time __endOld = new Time(17, 20, 50);
		int sel = 3;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(0, res.getHour());
		assertEquals(0, res.getMinute());
		assertEquals(0, res.getSecond());
		assertEquals(0, start.getHour());
		assertEquals(0, start.getMinute());
		assertEquals(0, start.getSecond());
		assertEquals(__endOld.getHour(), end.getHour());
		assertEquals(__endOld.getMinute(), end.getMinute());
		assertEquals(__endOld.getSecond(), end.getSecond());
	}

	@Test
	void test4() {
		Time time = new Time(2, 57, 3);
		Time __timeOld = new Time(2, 57, 3);
		Time start = new Time(6, 21, 59);
		Time end = new Time(11, 20, 7);
		Time __endOld = new Time(11, 20, 7);
		int sel = 3;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(__timeOld.getHour(), res.getHour());
		assertEquals(__timeOld.getMinute(), res.getMinute());
		assertEquals(__timeOld.getSecond(), res.getSecond());
	}

}
