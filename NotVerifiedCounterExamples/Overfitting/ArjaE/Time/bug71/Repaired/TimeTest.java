package ArjaE.Time.bug71.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void test0() {
		fail("Not yet implemented");
	}

	@Test
	void test1() {
		Time time = new Time(1, 6, 1);
		Time __timeOld = new Time(1, 6, 1);
		Time start = new Time(16, 5, 2);
		Time __startOld = new Time(16, 5, 2);
		Time end = new Time(16, 5, 2);
		Time __endOld = new Time(16, 5, 2);
		int sel = 1;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(0, res.getHour());
		assertEquals(0, res.getMinute());
		assertEquals(0, res.getSecond());
		assertEquals(__startOld.getHour(), start.getHour());
		assertEquals(__startOld.getMinute(), start.getMinute());
		assertEquals(__startOld.getSecond(), start.getSecond());
		assertEquals(__endOld.getHour(), end.getHour());
		assertEquals(__endOld.getMinute(), end.getMinute());
		assertEquals(__endOld.getSecond(), end.getSecond());
	}

	@Test
	void test2() {
		Time time = new Time(11, 1, 1);
		Time __timeOld = new Time(11, 1, 1);
		Time start = new Time(11, 1, 2);
		Time __startOld = new Time(11, 1, 2);
		Time end = new Time(11, 1, 1);
		Time __endOld = new Time(11, 1, 1);
		int sel = 3;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(__timeOld.getHour(), res.getHour());
		assertEquals(__timeOld.getMinute(), res.getMinute());
		assertEquals(__timeOld.getSecond(), res.getSecond());
	}

	@Test
	void test3() {
		Time time = new Time(1, 40, 1);
		Time __timeOld = new Time(1, 40, 1);
		Time start = new Time(1, 40, 1);
		Time __startOld = new Time(1, 40, 1);
		Time end = new Time(1, 40, 2);
		Time __endOld = new Time(1, 40, 2);
		int sel = 3;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(__timeOld.getHour(), res.getHour());
		assertEquals(__timeOld.getMinute(), res.getMinute());
		assertEquals(__timeOld.getSecond(), res.getSecond());
	}

	@Test
	void test4() {
		Time time = new Time(23, 43, 0);
		Time __timeOld = new Time(23, 43, 0);
		Time start = new Time(23, 41, 59);
		Time __startOld = new Time(23, 41, 59);
		Time end = new Time(22, 25, 31);
		Time __endOld = new Time(22, 25, 31);
		int sel = 2;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(0, res.getHour());
		assertEquals(0, res.getMinute());
		assertEquals(0, res.getSecond());
		assertEquals(__startOld.getHour(), start.getHour());
		assertEquals(__startOld.getMinute(), start.getMinute());
		assertEquals(__startOld.getSecond(), start.getSecond());
		assertEquals(__endOld.getHour(), end.getHour());
		assertEquals(__endOld.getMinute(), end.getMinute());
		assertEquals(__endOld.getSecond(), end.getSecond());
	}

	@Test
	void test5() {
		Time time = new Time(16, 0, 0);
		Time __timeOld = new Time(16, 0, 0);
		Time start = new Time(16, 0, 0);
		Time __startOld = new Time(16, 0, 0);
		Time end = new Time(11, 0, 9);
		Time __endOld = new Time(11, 0, 9);
		int sel = 3;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(__timeOld.getHour(), res.getHour());
		assertEquals(__timeOld.getMinute(), res.getMinute());
		assertEquals(__timeOld.getSecond(), res.getSecond());
	}

	@Test
	void test6() {
		Time time = new Time(3, 0, 24);
		Time __timeOld = new Time(3, 0, 24);
		Time start = new Time(0, 1, 0);
		Time __startOld = new Time(0, 1, 0);
		Time end = new Time(0, 1, 0);
		Time __endOld = new Time(0, 1, 0);
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
	void test7() {
		Time time = new Time(0, 0, 2);
		Time __timeOld = new Time(0, 0, 2);
		Time start = new Time(4, 29, 11);
		Time __startOld = new Time(4, 29, 11);
		Time end = new Time(4, 29, 11);
		Time __endOld = new Time(4, 29, 11);
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

}
