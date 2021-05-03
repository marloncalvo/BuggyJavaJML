
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
	@Test
	void test() {
		fail("Cannot access values of o.");
	}

	@Test
	void test0() {
		Time a = new Time(6, 48, 30);
		Time b = new Time(7, 47, 31);
		assertNotEquals(a, b);
	}
}
