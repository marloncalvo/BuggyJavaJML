package ArjaE.Time.bug75.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		Time a = new Time(16, 46, 56);
		Time b = new Time(17, 47, 57);
		assertNotEquals(a, b);
	}

	@Test
	void test0() {
		fail("The function equals() is not testable for this case");
	}

	@Test
	void test1() {
		Time time = new Time(1, 0, 0);
		assertFalse(time.isTimeZero());
	}

	@Test
	void test2() {
		Time time = new Time(1, 59, 27);
		Time __timeOld = new Time(1, 59, 27);
		Time start = new Time(18, 26, 21);
		Time __startOld = new Time(18, 26, 21);
		Time end = new Time(18, 26, 21);
		Time __endOld = new Time(18, 26, 21);
		int sel = 4;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(0, res.getHour());
		assertEquals(0, res.getMinute());
		assertEquals(0, res.getSecond());
	}

	@Test
	void test3() {
		Time time = new Time(17, 0, 0);
		Time __timeOld = new Time(17, 0, 0);
		Time start = new Time(16, 4, 29);
		Time __startOld = new Time(16, 4, 29);
		Time end = new Time(17, 0, 0);
		Time __endOld = new Time(17, 0, 0);
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
	void test4() {
		Time time = new Time(20, 25, 47);
		Time __timeOld = new Time(20, 25, 47);
		Time start = new Time(19, 24, 30);
		Time __startOld = new Time(19, 24, 30);
		Time end = new Time(11, 52, 9);
		Time __endOld = new Time(11, 52, 9);
		int sel = 3;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(__timeOld.getHour(), res.getHour());
		assertEquals(__timeOld.getMinute(), res.getMinute());
		assertEquals(__timeOld.getSecond(), res.getSecond());
	}

}
