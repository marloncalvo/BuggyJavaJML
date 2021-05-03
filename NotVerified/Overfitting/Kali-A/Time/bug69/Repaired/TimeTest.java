
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
		Time start = new Time(9, 3, 34);
		Time stop = new Time(9, 2, 33);
		int sel = 2;
		
		Time res = time.timeOptions(start, stop, sel);
		
		assertAll(
				() -> {assertEquals(res.getHour(), 0);},
				() -> {assertEquals(res.getMinute(), 0);},
				() -> {assertEquals(res.getSecond(), 0);});
	}
	
}
