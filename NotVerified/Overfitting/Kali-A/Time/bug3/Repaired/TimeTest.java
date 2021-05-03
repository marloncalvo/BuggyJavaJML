
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
	@Test
	void case1() {
		Time time = new Time(13, 35, 25);
		assertThrows(IllegalArgumentException.class, () -> {
			time.setSecond(60);
		});
	}

	@Test
	void case2() {
		Time time = new Time(23, 33, 20);
		assertThrows(IllegalArgumentException.class, () -> {
			time.setSecond(60);
		});
	}
	
}
