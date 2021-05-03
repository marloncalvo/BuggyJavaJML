package ArjaE.Time.bug70.Repaired;

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
		Time time = new Time(1, 29, 6);
		Time __timeOld = new Time(1, 29, 6);
		Time start = new Time(14, 25, 29);
		Time __startOld = new Time(14, 25, 29);
		Time end = new Time(14, 25, 17);
		Time __endOld = new Time(14, 25, 17);
		int sel = 3;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(__timeOld.getHour(), res.getHour());
		assertEquals(__timeOld.getMinute(), res.getMinute());
		assertEquals(__timeOld.getSecond(), res.getSecond());
	}

	@Test
	void test2() {
		Time time = new Time(0, 32, 59);
		Time __timeOld = new Time(0, 32, 59);
		Time start = new Time(12, 2, 58);
		Time __startOld = new Time(12, 2, 58);
		Time end = new Time(12, 2, 58);
		Time __endOld = new Time(12, 2, 58);
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
