
import static org.junit.Assert.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
public class TimeTest {
	@Test
	void case1() {
		Time time = new Time(22, 37, 35);
		Time time2 = new Time(-1, -1, -1);
		assertFalse(time.equals(time2));
	}
		
	@Test
	void case2() {
		Time time = new Time(10, 12, 33);
		Time start = new Time(20, 32, 3);
		Time stop = new Time(23, 30, 48);
		Time res = time.difference(start, stop);
		
		assertAll(
				() -> {assertEquals(res.getHour(), 2);},
				() -> {assertEquals(res.getMinute(), 58);},
				() -> {assertEquals(res.getSecond(), 45);});
		
	}
	
}
