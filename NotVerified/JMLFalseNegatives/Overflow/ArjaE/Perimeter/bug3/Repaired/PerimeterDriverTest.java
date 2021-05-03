
import static org.junit.Assert.*;
import org.junit.Test;
public class PerimeterDriverTest {
	@Test
	void test() {
		PerimeterDriver driver = new PerimeterDriver();
		long res = driver.driver(10, 0, 0, 0, 0, (short)0, Long.MAX_VALUE/6 + 2);
		assertTrue(res > 0); // simulate overflow
	}

}
