package ArjaE.Time.bug65.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		Time a = new Time(8, 12, 46);
		Time b = new Time(9, 13, 47);
		assertNotEquals(a, b);
	}

	@Test
	void test0() {
		fail("The function equals() is not testable for this case");
	}

	@Test
	void test1() {
		Time time = new Time(5, 5, 46);
		Time res = time.getTime();
		assertEquals(time.getHour(), res.getHour());
		assertEquals(time.getMinute(), res.getMinute());
		assertEquals(time.getSecond(), res.getSecond());
	}

	@Test
	void test2() {
		Time time = new Time(1, 41, 43);
		Time __timeOld = new Time(1, 41, 43);
		Time start = new Time(16, 12, 55);
		Time __startOld = new Time(16, 12, 55);
		Time end = new Time(16, 12, 5);
		Time __endOld = new Time(16, 12, 5);
		int sel = 0;
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

}
