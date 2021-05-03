package KaliA.Time.bug50.Repaired;

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
		Time time = new Time(10, 12, 33);
		Time start = new Time(9, 46, 48);
		Time stop = new Time(18, 35, 21);
		Time res = time.difference(start, stop);
		
		assertAll(
				() -> {assertEquals(res.getHour(), 8);},
				() -> {assertEquals(res.getMinute(), 48);},
				() -> {assertEquals(res.getSecond(), 33);});
		
	}
	
	@Test
	void case3() {
		Time time = new Time(13, 25, 5);
		Time start = new Time(8, 46, 42);
		Time stop = new Time(16, 46, 27);
		Time res = time.difference(start, stop);
		
		assertAll(
				() -> {assertEquals(res.getHour(), 7);},
				() -> {assertEquals(res.getMinute(), 59);},
				() -> {assertEquals(res.getSecond(), 45);});
	}
	
}
