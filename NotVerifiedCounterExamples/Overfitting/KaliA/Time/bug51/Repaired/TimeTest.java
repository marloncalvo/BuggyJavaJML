package KaliA.Time.bug51.Repaired;

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
		Time time = new Time(13, 35, 37);
		Time start = new Time(2, 12, 29);
		Time stop = new Time(6, 23, 27);
		Time res = time.difference(start, stop);
		
		assertAll(
				() -> {assertEquals(res.getHour(), 4);},
				() -> {assertEquals(res.getMinute(), 10);},
				() -> {assertEquals(res.getSecond(), 58);});
		
	}
	
	@Test
	void case4() {
		Time time = new Time(13, 35, 37);
		Time start = new Time(3, 59, 36);
		Time stop = new Time(22, 58, 20);
		Time res = time.difference(start, stop);
		
		assertAll(
				() -> {assertEquals(res.getHour(), 18);},
				() -> {assertEquals(res.getMinute(), 58);},
				() -> {assertEquals(res.getSecond(), 44);});
	}
	
}
