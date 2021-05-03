
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
	@Test
	void test() {
		Time a = new Time(9, 5, 47);
		Time b = new Time(8, 5, 46);
		assertNotEquals(a, b);
	}
	
	@Test
	void test0() {
		Time time = new Time(1, 30, 27);
		time.timeOptions(new Time(), new Time(), 3);
		assertEquals(1, time.getHour());
		assertEquals(30, time.getHour());
		assertEquals(27, time.getHour());
	}
}
