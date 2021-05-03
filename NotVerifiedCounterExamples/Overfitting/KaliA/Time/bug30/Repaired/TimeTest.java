package KaliA.Time.bug30.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void case1() {
		Time time = new Time(13, 35, 25);
		assertFalse(time.equals(null));
	}

	@Test
	void case2() {
		Time time = new Time(23, 33, 20);
		assertFalse(time.equals(""));
	}
	
	@Test
	void case3() {
		Time time = new Time(23, 17, 41);
		time.timer();
		
		assertEquals(time.convertToSeconds(), 0);
	}
	
	@Test
	void case4() {
		Time time = new Time(0, 0, 0);
		assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
			time.timer();
			assertEquals(time.convertToSeconds(), 0);
		});
	}
}
