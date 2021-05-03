
import static org.junit.Assert.*;
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
		Time time = new Time(1, 26, 38);
		Time start = new Time(22, 2, 2);
		Time stop = new Time(3, 31, 5);
		int sel = 4;
		
		Time res = time.timeOptions(start, stop, sel);
		

		assertEquals(res.getHour(), 18);
		assertEquals(res.getMinute(), 30);
		assertEquals(res.getSecond(), 57);
		
	}
	
	@Test
	void case4() {
		Time time = new Time(1, 26, 38);
		Time start = new Time(15, 45, 6);
		Time stop = new Time(15, 46, 8);
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
	void case5() {
		Time time = new Time(1, 26, 38);
		Time start = new Time(16, 0, 24);
		Time stop = new Time(16, 0, 39);
		int sel = 1;
		
		Time res = time.timeOptions(start, stop, sel);
		

		assertEquals(res.getHour(), 0);
		assertEquals(res.getMinute(), 0);
		assertEquals(res.getSecond(), 0);
	}
	
	@Test
	/**
	 * Assumed to be wrong because equals is also incorrect.
	 */
	void case6() {
		Time time = new Time(1, 26, 38);
		Time start = new Time(1, 45, 0);
		Time stop = new Time(1, 45, 0);
		int sel = 3;
		
		Time res = time.timeOptions(start, stop, sel);
		

		assertEquals(res.getHour(), 0);
		assertEquals(res.getMinute(), 0);
		assertEquals(res.getSecond(), 0);
	}
	
}
