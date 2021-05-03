package KaliA.Time.bug64.Repaired;

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
		Time time = new Time(19, 53, 52);
		Time start = new Time(18, 2, 8);
		Time stop = new Time(18, 2, 15);
		int sel = 0;
		
		Time res = time.timeOptions(start, stop, sel);
		
		assertAll(
				() -> {assertEquals(res.getHour(), 0);},
				() -> {assertEquals(res.getMinute(), 0);},
				() -> {assertEquals(res.getSecond(), 0);});
		
	}
	
	@Test
	void case4() {
		Time time = new Time(2, 37, 56);
		Time start = new Time(2, 37, 56);
		Time stop = new Time(1, 36, 57);
		int sel = 3;
		
		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		
		Time res = time.timeOptions(start, stop, sel);
		
		assertAll(
				() -> {assertEquals(res.getHour(), hour);},
				() -> {assertEquals(res.getMinute(), min);},
				() -> {assertEquals(res.getSecond(), sec);});
	}
	
	@Test
	void case5() {
		Time time = new Time(2, 37, 56);
		Time start = new Time(2, 37, 56);
		Time stop = new Time(1, 36, 57);
		int sel = 3;
		
		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		
		Time res = time.timeOptions(start, stop, sel);
		
		assertAll(
				() -> {assertEquals(res.getHour(), hour);},
				() -> {assertEquals(res.getMinute(), min);},
				() -> {assertEquals(res.getSecond(), sec);});
	}
	
	@Test
	void case6() {
		Time time = new Time(20, 53, 59);
		Time start = new Time(19, 30, 50);
		Time stop = new Time(10, 5, 1);
		int sel = 4;
		
		Time res = time.timeOptions(start, stop, sel);
		
		assertAll(
				() -> {assertEquals(res.getHour(), 9);},
				() -> {assertEquals(res.getMinute(), 25);},
				() -> {assertEquals(res.getSecond(), 49);});
		
	}
	
	@Test
	/**
	 * Assumed to be wrong because equals is also incorrect.
	 */
	void case7() {
		Time time = new Time(0, 58, 1);
		Time start = new Time(0, 58, 1);
		Time stop = new Time(0, 58, 1);
		int sel = 3;
		
		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		
		Time res = time.timeOptions(start, stop, sel);
		
		assertAll(
				() -> {assertEquals(res.getHour(), 0);},
				() -> {assertEquals(res.getMinute(), 0);},
				() -> {assertEquals(res.getSecond(), 0);});
		
	}
	
}
