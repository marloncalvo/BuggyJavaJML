package ArjaE.Time.bug40.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		Time time = new Time(10, 12, 33);
		Time a = new Time(3, 37, 7);
		Time b = new Time(2, 15, 5);
		Time diff = time.difference(a, b);
		assertEquals(1, diff.getHour());
		assertEquals(22, diff.getMinute());
		assertEquals(2, diff.getSecond());
	}

	@Test
	void test1() {
		Time a = new Time(8, 12, 46);
		Time b = new Time(9, 13, 47);
		assertNotEquals(a, b);
	}

	@Test
	void test2() {
		fail("The function equals() is not testable for this case");
	}

	@Test
	void test3() {
		Time time = new Time(10, 13, 35);
		Time start = new Time(10, 12, 25);
		assertTrue(time.later_than(start));
	}

}
