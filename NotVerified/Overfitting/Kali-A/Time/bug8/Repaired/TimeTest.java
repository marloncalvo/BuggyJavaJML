
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {	
	@Test
	void case1() {
		Time time = new Time(13, 25, 37);
		assertThrows(IllegalArgumentException.class, () -> {
			time.setMinute(60);
		});
	}
	
	@Test
	void case2() {
		Time time = new Time(21, 20, 2);
		assertThrows(IllegalArgumentException.class, () -> {
			time.setMinute(-1);
		});
	}
	
}
