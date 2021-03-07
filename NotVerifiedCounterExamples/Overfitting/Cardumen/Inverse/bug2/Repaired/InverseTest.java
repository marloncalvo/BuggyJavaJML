package Cardumen.Inverse.bug2.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InverseTest {

	@Test
	/**
	 * Out of heap memory for all cases.
	 */
	void test() {
		int len = 2147481210;
		int [] x = new int[len];
		int [] y = new int[len];
		
		x[0] = y[len-0-1] = 1;
		x[1] = y[len-1-1] = -1;
		x[2] = 3;
		
		assertFalse(Inverse.Inverse(x, y));
	}

}
