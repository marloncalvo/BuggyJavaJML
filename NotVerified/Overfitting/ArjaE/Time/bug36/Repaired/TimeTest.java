
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
	@Test
	public void test() {
		fail("Cannot test timer reasonably");
	}

	/**
	 * Not useful since this will always occur if inner times are not set.
	 * Since hour and minute must be in range, second will always set to 
	 * a valid value.
	 */
	@Test
	public void manual() {
		Time time = new Time(12, 13, 14);
		time.timer(13, 14, 15);
		assertEquals(0, time.convertToSeconds());
	}

}
