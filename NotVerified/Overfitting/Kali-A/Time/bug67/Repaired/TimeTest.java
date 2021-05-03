
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {	
	@Test
	void case1() {
		Time time = new Time(22, 35, 37);
		assertFalse(time.equals(null));
	}
	
	@Test
	void case2() {
		Time time = new Time(10, 12, 33);
		assertFalse(time.equals(""));
	}
	
	@Test
	void case3() {
		Time time = new Time(1, 26, 38);
		Time start = new Time(19, 10, 28);
		Time stop = new Time(20, 11, 27);
		int sel = 1;
		
		Time res = time.timeOptions(start, stop, sel);
		

		assertEquals(res.getHour(), 0);
		assertEquals(res.getMinute(), 0);
		assertEquals(res.getSecond(), 0);
		
	}
	
}
