package ArjaE.Time.bug46.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		fail("The function equals() is not testable for this case");
	}

	@Test
	void test1() {
		Time time = new Time(13, 3, 1);
		Time __timeOld = new Time(13, 3, 1);
		Time start = new Time(4, 49, 59);
		Time end = new Time(4, 49, 59);
		Time __endOld = new Time(4, 49, 59);
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
	void test2() {
		Time time = new Time(23, 11, 24);
		Time __timeOld = new Time(23, 11, 24);
		Time start = new Time(6, 26, 54);
		Time end = new Time(0, 3, 56);
		Time __endOld = new Time(0, 3, 56);
		int sel = 3;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(__timeOld.getHour(), res.getHour());
		assertEquals(__timeOld.getMinute(), res.getMinute());
		assertEquals(__timeOld.getSecond(), res.getSecond());
	}

	@Test
	void test3() {
		Time time = new Time(3, 44, 1);
		Time __timeOld = new Time(3, 44, 1);
		Time start = new Time(3, 44, 1);
		Time end = new Time(2, 27, 5);
		Time __endOld = new Time(2, 27, 5);
		int sel = 4;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(1, res.getHour());
		assertEquals(16, res.getMinute());
		assertEquals(56, res.getSecond());
	}

}
