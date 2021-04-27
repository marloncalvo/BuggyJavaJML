package ArjaE.Time.bug61.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		Time time = new Time(23, 37, 35);
		Time a = new Time(21, 20, 47);
		Time b = new Time(21, 20, 46);
		Time diff = time.difference(a, b);
		assertEquals(0, diff.getHour());
		assertEquals(0, diff.getMinute());
		assertEquals(1, diff.getSecond());
	}

	@Test
	void test0() {
		Time time = new Time(23, 36, 31);
		Time a = new Time(13, 32, 59);
		Time b = new Time(12, 30, 59);
		Time diff = time.difference(a, b);
		assertEquals(1, diff.getHour());
		assertEquals(2, diff.getMinute());
		assertEquals(0, diff.getSecond());
	}

	@Test
	void test1() {
		fail("The function equals() is not testable for this case");
	}

	@Test
	void test2() {
		fail("The function equals() is not testable for this case");
	}

	@Test
	void test3() {
		Time time = new Time(23, 37, 37);
		Time __timeOld = new Time(23, 37, 37);
		Time start = new Time(12, 7, 5);
		assertTrue(time.later_than(start));
		assertEquals(__timeOld.getHour(), time.getHour());
		assertEquals(__timeOld.getMinute(), time.getMinute());
		assertEquals(__timeOld.getSecond(), time.getSecond());
	}
	
	@Test
	void test4() {
		fail("The function trustedDifference() is not testable for this case");
	}
	
	@Test
	void test5() {
		fail("The function trustedDifference() is not testable for this case");
	}

}
