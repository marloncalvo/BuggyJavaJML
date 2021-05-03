
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
	@Test
	void test() {
		Time a = new Time(8, 12, 46);
		Time b = new Time(9, 13, 47);
		assertNotEquals(a, b);
	}

	@Test
	void test0() {
		fail("The function equals() is not testable for this case");
	}

	@Test
	void test1() {
		fail("The function trustedDifference() is not testable for this case");
	}
	
	@Test
	void test2() {
		fail("The function trustedDifference() is not testable for this case");
	}
}
