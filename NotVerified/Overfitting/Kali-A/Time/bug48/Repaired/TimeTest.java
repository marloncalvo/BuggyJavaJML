
import static org.junit.Assert.*;
import java.time.Duration;

import org.junit.Test;
public class TimeTest {
	@Test
	void case1() {
		Time time = new Time(22, 37, 35);
		assertFalse(time.equals(null));
	}

	@Test
	void case2() {
		Time time = new Time(10, 12, 33);
		assertFalse(time.equals(""));
	}
	
}
