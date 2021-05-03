
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
		Time time = new Time(21, 37, 7);
		Time start = new Time(5, 48, 7);
		Time stop = new Time(6, 31, 59);
		Time res = time.difference(start, stop);
		

		assertEquals(res.getHour(), 0);
		assertEquals(res.getMinute(), 43);
		assertEquals(res.getSecond(), 52);
		
	}
	
}
