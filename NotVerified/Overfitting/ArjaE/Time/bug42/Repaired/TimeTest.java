
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
	@Test
	void test() {
		fail("The function equals() is not testable for this case");
	}

	@Test
	void test1() {
		fail("The function equals() is not testable for this case");
	}

	@Test
	void test2() {
		Time time = new Time(10, 5, 47);
		Time start = new Time(10, 5, 46);
		assertTrue(time.later_than(start));
	}

}
