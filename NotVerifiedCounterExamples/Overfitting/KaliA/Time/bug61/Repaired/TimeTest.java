package KaliA.Time.bug61.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

class TimeTest {
	
	@Test
	void case1() {
		Time time = new Time(10, 5, 33);
		Time start = new Time(14, 0, 59);
		Time stop = new Time(14, 0, 58);
		Time res = time.difference(start, stop);
		
		assertAll(
				() -> {assertEquals(res.getHour(), 0);},
				() -> {assertEquals(res.getMinute(), 0);},
				() -> {assertEquals(res.getSecond(), 1);});
		
	}
	
}
