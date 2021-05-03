
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
		int hour = 0;
		Time time = new Time(hour, 37, 35);
		assertEquals(time.getHour(), hour);
	}
	
}
