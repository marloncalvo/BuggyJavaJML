package Overflow.ArjaE.Perimeter.bug3.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PerimeterDriverTest {

	@Test
	void test() {
		PerimeterDriver driver = new PerimeterDriver();
		long res = driver.driver(10, 0, 0, 0, 0, (short)0, Long.MAX_VALUE/6 + 2);
		assertTrue(res > 0); // simulate overflow
	}

}
