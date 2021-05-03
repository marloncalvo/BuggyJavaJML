
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
		Time time = new Time(1, 3, 22);
		Time start = new Time(23, 2, 5);
		Time stop = new Time(23, 2, 28);
		int sel = 2;
		
		Time res = time.timeOptions(start, stop, sel);
		
		
		assertEquals(res.getHour(), 0);
		assertEquals(res.getMinute(), 0);
		assertEquals(res.getSecond(), 0);
		
	}

	@Test
	void case3() {
		Time time = new Time(1, 3, 22);
		Time start = new Time(1, 39, 59);
		Time stop = new Time(14, 40, 2);
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
	/**
	 * Assumed to be wrong because equals is also incorrect.
	 */
	void case4() {
		Time time = new Time(1, 3, 22);
		Time start = new Time(0, 0, 1);
		Time stop = new Time(0, 0, 1);
		int sel = 3;
		
		Time res = time.timeOptions(start, stop, sel);
		

		assertEquals(res.getHour(), 0);
		assertEquals(res.getMinute(), 0);
		assertEquals(res.getSecond(), 0);
		
	}

	@Test
	/**
	 * Assumed to be wrong because equals is also incorrect.
	 */
	void case5() {
		Time time = new Time(1, 3, 22);
		Time start = new Time(21, 43, 2);
		Time stop = new Time(5, 15, 3);
		int sel = 4;
		
		Time res = time.timeOptions(start, stop, sel);
		
		
		assertEquals(res.getHour(), 16);
		assertEquals(res.getMinute(), 27);
		assertEquals(res.getSecond(), 59);
		
	}
	
}
