
import static org.junit.Assert.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
public class TimeTest {
	@Test
	void case1() {
		Time time = new Time(13, 35, 37);
		Time time2 = new Time(-1, -1, -1);
		assertFalse(time.equals(time2));
	}

	@Test
	void case2() {
		Time time = new Time(23, 37, 25);
		Time start = new Time(11, 39, 58);
		Time stop = new Time(14, 21, 57);
		Time res = time.difference(start, stop);
		
		assertAll(
				() -> {assertEquals(res.getHour(), 2);},
				() -> {assertEquals(res.getMinute(), 41);},
				() -> {assertEquals(res.getSecond(), 59);});
		
	}
	
}
