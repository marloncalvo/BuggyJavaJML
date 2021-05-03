
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
	@Test
	void test() {
		Time time = new Time(5, 25, 37);
		Time res = time.getTime();
		assertEquals(time.getHour(), res.getHour());
		assertEquals(time.getMinute(), res.getMinute());
		assertEquals(time.getSecond(), res.getSecond());
	}

	@Test
	void test0() {
		Time time = new Time(5, 25, 37);
		Time res = time.getTime();
		assertEquals(time.getHour(), res.getHour());
		assertEquals(time.getMinute(), res.getMinute());
		assertEquals(time.getSecond(), res.getSecond());
	}

}
