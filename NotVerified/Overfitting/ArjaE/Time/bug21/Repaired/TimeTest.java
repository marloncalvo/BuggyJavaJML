
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
	@Test
	void test() {
		Time time = new Time(1, 59, 5);
		assertEquals(7_145, time.convertToSeconds());
	}

	@Test
	void test0() {
		Time time = new Time(0, 0, 2);
		assertEquals(0, time.getHour());
		assertEquals(0, time.getMinute());
		assertEquals(1, time.getSecond());
	}
	
	@Test
	void test1() {
		Time time = new Time();
		time.setHour(13);
		assertEquals(13, time.getHour());
	}
	
	@Test
	void test2() {
		Time time = new Time();
		assertThrows(IllegalArgumentException.class, () -> {
			time.setHour(24);
		});
	}
	
	@Test
	void test3() {
		Time time = new Time();
		time.setHour(23);
		assertEquals(23, time.getHour());
	}
}
