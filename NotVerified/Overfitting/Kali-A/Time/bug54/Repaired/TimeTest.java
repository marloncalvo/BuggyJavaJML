
import static org.junit.Assert.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
public class TimeTest {
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
		Time start = new Time(6, 33, 51);
		Time stop = new Time(9, 34, 49);
		Time res = time.difference(start, stop);
		
		assertAll(
				() -> {assertEquals(res.getHour(), 3);},
				() -> {assertEquals(res.getMinute(), 0);},
				() -> {assertEquals(res.getSecond(), 58);});
		
	}
	
}
