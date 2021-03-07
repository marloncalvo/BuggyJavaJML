package KaliA.Time.bug54.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void case1() {
		Time time = new Time(13, 35, 37);
		assertFalse(time.equals(null));
	}

	@Test
	void case2() {
		Time time = new Time(21, 20, 2);
		assertFalse(time.equals(""));
	}
	
	@Test
	void case3() {
		Time time = new Time(21, 37, 25);
		Time start = new Time(2, 30, 40);
		Time stop = new Time(2, 59, 17);
		Time res = time.difference(start, stop);
		
		assertAll(
				() -> {assertEquals(res.getHour(), 0);},
				() -> {assertEquals(res.getMinute(), 28);},
				() -> {assertEquals(res.getSecond(), 37);});
		
	}
	
}
