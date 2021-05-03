
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
	@Test
	void test() {
		Time time = new Time(-1, -1, -1);
		
			time.setHour(0);
				assertEquals(0, time.getHour());
	}

	@Test
	void test0() {
		fail("The function timer() is not testable for this case");
	}

}
