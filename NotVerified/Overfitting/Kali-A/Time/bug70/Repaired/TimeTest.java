
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {	
	@Test
	void case1() {
		Time time = new Time(13, 25, 37);
		assertFalse(time.equals(null));
	}
	
	@Test
	void case2() {
		Time time = new Time(21, 20, 2);
		assertFalse(time.equals(""));
	}
	
	@Test
	void case3() {
		Time time = new Time(1, 32, 22);
		Time start = new Time(0, 32, 22);
		Time stop = new Time(23, 32, 4);
		int sel = 4;
		
		Time res = time.timeOptions(start, stop, sel);
		

		assertEquals(res.getHour(), 23);
		assertEquals(res.getMinute(), 0);
		assertEquals(res.getSecond(), 1);
		
	}
	
	@Test
	void case4() {
		Time time = new Time(1, 14, 58);
		Time start = new Time(4, 45, 48);
		Time stop = new Time(5, 1, 1);
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
		Time time = new Time(2, 10, 1);
		Time start = new Time(11, 13, 7);
		Time stop = new Time(11, 13, 7);
		int sel = 3;
		
		Time res = time.timeOptions(start, stop, sel);
		

		assertEquals(res.getHour(), 0);
		assertEquals(res.getMinute(), 0);
		assertEquals(res.getSecond(), 0);
		
	}
	
}
