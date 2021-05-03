package ArjaE.Time.bug66.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		fail("The function equals() is not testable for this case");
	}

	@Test
	void test0() {
		fail("The function equals() is not testable for this case");
	}

	@Test
	void test1() {
		Time time = new Time(1, 55, 37);
		Time __timeOld = new Time(1, 55, 37);
		Time start = new Time(1, 53, 38);
		Time __startOld = new Time(1, 53, 38);
		Time end = new Time(1, 55, 37);
		Time __endOld = new Time(1, 55, 37);
		int sel = 3;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(__timeOld.getHour(), res.getHour());
		assertEquals(__timeOld.getMinute(), res.getMinute());
		assertEquals(__timeOld.getSecond(), res.getSecond());
	}

	@Test
	void test2() {
		Time time = new Time(0, 1, 0);
		Time __timeOld = new Time(0, 1, 0);
		Time start = new Time(14, 43, 59);
		Time __startOld = new Time(14, 43, 59);
		Time end = new Time(14, 2, 41);
		Time __endOld = new Time(14, 2, 41);
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
	void test3() {
		Time time = new Time(1, 35, 47);
		Time __timeOld = new Time(1, 35, 47);
		Time start = new Time(12, 34, 48);
		Time __startOld = new Time(12, 34, 48);
		Time end = new Time(12, 34, 48);
		Time __endOld = new Time(12, 34, 48);
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
		Time time = new Time(1, 46, 36);
		Time __timeOld = new Time(1, 46, 36);
		Time start = new Time(0, 45, 54);
		Time __startOld = new Time(0, 45, 54);
		Time end = new Time(1, 46, 36);
		Time __endOld = new Time(1, 46, 36);
		int sel = 4;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(0, res.getHour());
		assertEquals(0, res.getMinute());
		assertEquals(0, res.getSecond());
	}

	@Test
	void test5() {
		Time time = new Time(13, 33, 1);
		time.timer(5, 10, 12);
		assertEquals(0, time.convertToSeconds());
	}
}
