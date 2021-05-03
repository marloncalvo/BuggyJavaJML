package KaliA.Time.bug35.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void case1() {
		Time time = new Time(22, 35, 25);
		Time time2 = new Time(-1, -1, -1);
		assertFalse(time.equals(time2));
	}
	
	@Test
	void case2() {
		Time time = new Time(13, 5, 1);
		time.timer(0, 51, 0);
		
		assertEquals(time.convertToSeconds(), 0);
	}

}
