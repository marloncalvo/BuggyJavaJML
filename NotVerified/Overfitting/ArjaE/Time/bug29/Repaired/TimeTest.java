
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
	@Test
	void test() {
		Time time = new Time(0, 0, 2);
		time.decr();
		assertEquals(0, time.getHour());
		assertEquals(0, time.getMinute());
		assertEquals(1, time.getSecond());
	}
}
