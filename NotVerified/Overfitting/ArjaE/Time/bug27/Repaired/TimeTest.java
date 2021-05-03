
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
	@Test
	void test() {
		Time time = new Time(0, 1, 0);
		time.decr();
		assertEquals(0, time.getHour());
		assertEquals(0, time.getMinute());
		assertEquals(59, time.getSecond());
	}

	@Test
	void test0() {
		Time time = new Time(6, 1, 0);
		time.decr();
		assertEquals(6, time.getHour());
		assertEquals(0, time.getMinute());
		assertEquals(59, time.getSecond());
	}
	
	@Test
	void test1() {
		Time time = new Time(10, 25, 0);
		assertFalse(time.isTimeZero());
		assertEquals(25, time.getMinute());
	}
}
