package KaliA.Time.bug15.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void case1() {
		Time time = new Time(22, 37, 35);
		Time time2 = new Time(-1, -1, -1);
		assertFalse(time.equals(time2));
	}

	@Test
	void case2() {
		int minute = 0;
		Time time = new Time(13, minute, 35);
		assertEquals(time.getMinute(), minute);
	}
	
}
