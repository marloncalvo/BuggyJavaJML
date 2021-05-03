package KaliA.Time.bug49.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

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
		Time start = new Time(21, 47, 58);
		Time stop = new Time(21, 47, 58);
		Time res = time.difference(start, stop);
		
		assertAll(
				() -> {assertEquals(res.getHour(), 0);},
				() -> {assertEquals(res.getMinute(), 0);},
				() -> {assertEquals(res.getSecond(), 0);});
		
	}
	
	@Test
	void case3() {
		Time time = new Time(10, 12, 33);
		Time start = new Time(18, 30, 58);
		Time stop = new Time(18, 38, 58);
		Time res = time.difference(start, stop);
		
		assertAll(
				() -> {assertEquals(res.getHour(), 0);},
				() -> {assertEquals(res.getMinute(), 8);},
				() -> {assertEquals(res.getSecond(), 0);});
	}
	
}
