package ArjaE.Time.bug37.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

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
