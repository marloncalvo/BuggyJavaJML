package KaliA.Time.bug4.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void case1() {
		Time time = new Time(13, 35, 25);
		assertThrows(IllegalArgumentException.class, () -> {
			time.setSecond(60);
		});
	}
	
	@Test
	void case2() {
		Time time = new Time(23, 33, 20);
		assertThrows(IllegalArgumentException.class, () -> {
			time.setSecond(60);
		});
	}

}
