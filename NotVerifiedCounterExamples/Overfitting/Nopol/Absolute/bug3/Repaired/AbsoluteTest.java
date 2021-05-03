package Nopol.Absolute.bug3.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AbsoluteTest {

	@Test
	void case1() {
		Absolute abs = new Absolute();
		assertEquals(abs.Absolute(1), 1);
	}

}
