package KaliA.Time.bug21.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void case1() {
		Time time = new Time(1, 59, 10);
		assertEquals(time.convertToSeconds(), 7150);
	}

	@Test
	void case2() {
		Time time = new Time(13, 35, 37);
		Time time2 = new Time(-1, -1, -1);
		assertFalse(time.equals(time2));
	}
	
}
