package KaliA.Time.bug43.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void case1() {
		Time time = new Time(22, 37, 35);
		assertDoesNotThrow(() -> {
			assertFalse(time.equals(null));
		});
	}

}
