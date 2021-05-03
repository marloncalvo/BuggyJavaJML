package ArjaE.Time.bug11.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		int h = -1;
		Time time = new Time();
		assertThrows(IllegalArgumentException.class, () -> {
			time.setHour(h);
		});
	}
	
	@Test
	void test0() {
		int h = -1;
		Time time = new Time();
		assertThrows(IllegalArgumentException.class, () -> {
			time.setHour(h);
		});
	}
	
	@Test
	void test1() {
		int h = 23;
		Time time = new Time();
		assertDoesNotThrow(() -> {
			time.setHour(h);
		});
		
		assertEquals(h, time.getHour());
	}

}
