
import static org.junit.Assert.*;
import java.time.Duration;

import org.junit.Test;
public class TimeTest {
	@Test
	void case1() {
		Time time = new Time(22, 37, 35);
		assertDoesNotThrow(() -> {
			assertFalse(time.equals(null));
		});
	}

}