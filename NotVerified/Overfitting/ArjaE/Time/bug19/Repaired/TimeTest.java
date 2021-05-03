
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
	@Test
	void test() {
		Time time = new Time(13, 35, 59);
		assertEquals(48_959, time.convertToSeconds());
	}

	@Test
	void test0() {
		Time time = new Time();
		assertThrows(IllegalArgumentException.class, () -> {
			time.setSecond(60);			
		});
	}
	
	@Test
	void test1() {
		Time time = new Time();
		assertThrows(IllegalArgumentException.class, () -> {
			time.setSecond(-1);			
		});
	}
}
