
import static org.junit.Assert.*;
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
		Time time = new Time(0, 1, 11);
		Time start = new Time(10, 59, 23);
		Time stop = new Time(10, 59, 23);
		int sel = 3;
		
		Time res = time.timeOptions(start, stop, sel);
		

		assertEquals(res.getHour(), 0);
		assertEquals(res.getMinute(), 0);
		assertEquals(res.getSecond(), 0);
		
	}
	
	@Test
	/**
	 * Passing because equals is messed up... i.e. since all times
	 * are equal, we never reset and always keep old value.
	 * 
	 * Shown as case only because equals is incorrect.
	 */
	void case3() {
		Time time = new Time(1, 0, 0);
		Time start = new Time(3, 51, 59);
		Time stop = new Time(7, 43, 58);
		int sel = 3;
		
		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		
		Time res = time.timeOptions(start, stop, sel);
				
		
		assertEquals(res.getHour(), hour);
		assertEquals(res.getMinute(), min);
		assertEquals(res.getSecond(), sec);
		
	}
	
	@Test
	void case4() {
		Time time = new Time(1, 0, 0);
		Time start = new Time(17, 59, 1);
		Time stop = new Time(17, 59, 1);
		int sel = 3;
		
		Time res = time.timeOptions(start, stop, sel);
		

		assertEquals(res.getHour(), 0);
		assertEquals(res.getMinute(), 0);
		assertEquals(res.getSecond(), 0);
		
	}
	
}
