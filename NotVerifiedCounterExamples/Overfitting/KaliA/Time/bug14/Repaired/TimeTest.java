package KaliA.Time.bug14.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void case1() {
		Time time = new Time(22, 35, 37);
		assertFalse(time.equals(null));
	}

	@Test
	void case2() {
		Time time = new Time(10, 12, 33);
		assertFalse(time.equals(""));
	}

	@Test
	void case3() {
		int second = 0;
		Time time = new Time(13, 35, second);
		assertEquals(time.getSecond(), second);
	}
	
}
