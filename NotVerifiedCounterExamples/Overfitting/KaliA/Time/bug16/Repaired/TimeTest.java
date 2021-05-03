package KaliA.Time.bug16.Repaired;

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
		int hour = 0;
		Time time = new Time(hour, 37, 35);
		assertEquals(time.getHour(), hour);
	}
	
}
