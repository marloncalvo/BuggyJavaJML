package KaliA.Time.bug39.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void case1() {
		Time time = new Time(13, 35, 37);
		Time time2 = new Time(-1, -1, -1);
		assertFalse(time.equals(time2));
	}
	
	@Test
	void case2() {
		Time time = new Time(5, 47, 0);
		Time start = new Time(5, 46, 37);
		assertTrue(time.later_than(start));
	}

}
