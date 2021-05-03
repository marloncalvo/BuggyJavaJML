package ArjaE.Time.bug42.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		fail("The function equals() is not testable for this case");
	}

	@Test
	void test1() {
		fail("The function equals() is not testable for this case");
	}

	@Test
	void test2() {
		Time time = new Time(10, 5, 47);
		Time start = new Time(10, 5, 46);
		assertTrue(time.later_than(start));
	}

}
