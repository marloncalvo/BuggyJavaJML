package KaliA.Time.bug48.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void case1() {
		Time time = new Time(22, 37, 35);
		assertFalse(time.equals(null));
	}

	@Test
	void case2() {
		Time time = new Time(10, 12, 33);
		assertFalse(time.equals(""));
	}
	
}
