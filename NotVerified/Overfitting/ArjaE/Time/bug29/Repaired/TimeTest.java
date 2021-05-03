package ArjaE.Time.bug29.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		Time time = new Time(0, 0, 2);
		time.decr();
		assertEquals(0, time.getHour());
		assertEquals(0, time.getMinute());
		assertEquals(1, time.getSecond());
	}
}
