package ArjaE.Time.bug64.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		Time time = new Time(5, 25, 37);
		Time res = time.getTime();
		assertEquals(time.getHour(), res.getHour());
		assertEquals(time.getMinute(), res.getMinute());
		assertEquals(time.getSecond(), res.getSecond());
	}

	@Test
	void test0() {
		Time time = new Time(5, 25, 37);
		Time res = time.getTime();
		assertEquals(time.getHour(), res.getHour());
		assertEquals(time.getMinute(), res.getMinute());
		assertEquals(time.getSecond(), res.getSecond());
	}

}
