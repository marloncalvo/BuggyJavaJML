package ArjaE.Time.bug9.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		Time time = new Time(-1, -1, -1);
		assertDoesNotThrow(() -> {
			time.setHour(0);
		});
		assertEquals(0, time.getHour());
	}

	@Test
	void test0() {
		fail("The function timer() is not testable for this case");
	}

}
