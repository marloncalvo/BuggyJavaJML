package KaliA.Time.bug7.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {
	
	@Test
	void case1() {
		Time time = new Time(13, 25, 37);
		assertThrows(IllegalArgumentException.class, () -> {
			time.setMinute(60);
		});
	}
	
	@Test
	void case2() {
		Time time = new Time(21, 20, 2);
		assertThrows(IllegalArgumentException.class, () -> {
			time.setMinute(60);
		});
	}
	
}
