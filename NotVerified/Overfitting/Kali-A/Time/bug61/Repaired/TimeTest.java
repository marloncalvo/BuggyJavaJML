
import static org.junit.Assert.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
public class TimeTest {	
	@Test
	void case1() {
		Time time = new Time(10, 5, 33);
		Time start = new Time(14, 0, 59);
		Time stop = new Time(14, 0, 58);
		Time res = time.difference(start, stop);
		
		
		assertEquals(res.getHour(), 0);
		assertEquals(res.getMinute(), 0);
		assertEquals(res.getSecond(), 1);
		
	}
	
}
