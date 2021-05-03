package ArjaE.Time.bug55.Repaired;

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
		Time time = new Time(0, 24, 0);
		Time __timeOld = new Time(0, 24, 0);
		Time start = new Time(1, 43, 30);
		Time __startOld = new Time(1, 43, 30);
		Time end = new Time(0, 51, 45);
		Time __endOld = new Time(0, 51, 45);
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

	// Decr is called but is in spec for sel == 3.
	@Test
	void test2() {
		Time time = new Time(0, 0, 0);
		Time __timeOld = new Time(0, 0, 0);
		Time start = new Time(8, 3, 45);
		Time __startOld = new Time(8, 3, 45);
		Time end = new Time(8, 3, 45);
		Time __endOld = new Time(8, 3, 45);
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
	void test3() {
		Time time = new Time(2, 10, 31);
		Time __timeOld = new Time(2, 10, 31);
		Time start = new Time(2, 10, 30);
		Time __startOld = new Time(2, 10, 30);
		Time end = new Time(2, 10, 31);
		Time __endOld = new Time(2, 10, 31);
		int sel = 3;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(__timeOld.getHour(), res.getHour());
		assertEquals(__timeOld.getMinute(), res.getMinute());
		assertEquals(__timeOld.getSecond(), res.getSecond());
	}

	// Decr is called but is in spec for sel == 3.
	@Test
	void test4() {
		Time time = new Time(19, 59, 1);
		Time __timeOld = new Time(19, 59, 1);
		Time start = new Time(19, 59, 1);
		Time __startOld = new Time(19, 59, 1);
		Time end = new Time(19, 59, 1);
		Time __endOld = new Time(19, 59, 1);
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
    void test5() {
        fail("The function trustedDifference() is not testable for this case");
    }
	
}
