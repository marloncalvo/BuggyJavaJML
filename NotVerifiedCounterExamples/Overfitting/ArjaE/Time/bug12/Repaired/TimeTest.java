package ArjaE.Time.bug12.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		int h = 24;
		Time time = new Time();
		assertThrows(IllegalArgumentException.class, () -> {
			time.setHour(h);
		});
	}
	
	@Test
	void test0() {
		int h = 24;
		Time time = new Time();
		assertThrows(IllegalArgumentException.class, () -> {
			time.setHour(h);
		});
	}
	
	@Test
	void test1() {
		int h = 22;
		Time time = new Time();
		assertDoesNotThrow(() -> {
			time.setHour(h);
		});
		
		assertEquals(h, time.getHour());
	}

}
