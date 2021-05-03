package jGenProg.Inverse.bug2.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InverseTest {

	@Test
	void case1() {
		int len = 7719;
		int [] x = new int[len], y = new int[len];
		
		x[0] = y[len-0-1] = 7719;
		x[7719] = y[len-7719-1] = 0;
		
		assertTrue(Inverse.Inverse(x, y));
	}

	@Test
	void case2() {
		int len = 8955;
		int [] x = new int[len], y = new int[len];

		x[0] = y[len-0-1] = 1236;
		x[1236] = y[len-1236-1] = 11;
		x[10] = 10;
		
		assertFalse(Inverse.Inverse(x, y));
	}
}
