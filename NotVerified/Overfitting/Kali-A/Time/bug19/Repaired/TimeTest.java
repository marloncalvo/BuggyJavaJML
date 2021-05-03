
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
	@Test
	void case1() {
		Time time = new Time(23, 59, 25);
		assertEquals(time.convertToSeconds(), 86365);
	}

	@Test
	void case2() {
		Time time = new Time(13, 35, 37);
		assertFalse(time.equals(null));
	}
	
	@Test
	void case3() {
		Time time = new Time(21, 20, 2);
		assertFalse(time.equals(""));
	}
	
}
