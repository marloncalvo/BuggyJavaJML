
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
		Time start = new Time(1, 31, 14);
		Time stop = new Time(2, 54, 55);
		Time res = time.difference(start, stop);
		

		assertEquals(res.getHour(), 1);
		assertEquals(res.getMinute(), 23);
		assertEquals(res.getSecond(), 41);
		
	}
	
}
