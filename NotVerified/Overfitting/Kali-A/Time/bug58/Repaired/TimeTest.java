package KaliA.Time.bug58.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void case1() {
		Time time = new Time(13, 37, 35);
		assertFalse(time.equals(null));
	}
	
	@Test
	void case2() {
		Time time = new Time(21, 20, 2);
		assertFalse(time.equals(""));
	}
	
	@Test
	void case3() {
		Time time = new Time(21, 37, 7);
		Time start = new Time(7, 17, 44);
		Time stop = new Time(10, 16, 26);
		Time res = time.difference(start, stop);
		
		assertAll(
				() -> {assertEquals(res.getHour(), 2);},
				() -> {assertEquals(res.getMinute(), 58);},
				() -> {assertEquals(res.getSecond(), 42);});
		
	}
	
}
