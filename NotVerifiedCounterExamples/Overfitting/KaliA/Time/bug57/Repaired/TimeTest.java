package KaliA.Time.bug57.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void case1() {
		Time time = new Time(13, 37, 35);
		Time time2 = new Time(-1, -1, -1);
		assertFalse(time.equals(time2));
	}
	
	@Test
	void case2() {
		Time time = new Time(21, 37, 7);
		Time start = new Time(0, 58, 57);
		Time stop = new Time(2, 39, 55);
		Time res = time.difference(start, stop);
		
		assertAll(
				() -> {assertEquals(res.getHour(), 1);},
				() -> {assertEquals(res.getMinute(), 40);},
				() -> {assertEquals(res.getSecond(), 58);});
		
	}
	
}
