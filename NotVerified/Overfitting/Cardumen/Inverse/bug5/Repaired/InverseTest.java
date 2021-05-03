package Cardumen.Inverse.bug5.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InverseTest {

//	@Test
	/**
	 * Array size too big.
	 */
	void case1() {
		int len = 2147483647;
		int [] x = new int[len];
		int [] y = new int[len];
		
		x[0] = y[len-0-1] = 2;
		x[2] = 11;
		x[11] = len+2;
		y[len-2-1] = 12;
		y[len-12-1] = len+2;
		
		assertFalse(Inverse.Inverse(x, y));
	}
	
	@Test
	void case2() {
		int len = 2439;
		int [] x = new int[len];
		int [] y = new int[len];
		
		x[0] = y[len-0-1] = 897;
		x[897] = 12;
		y[len-897-1] = 13;
		x[12] = len+3;
		y[len-12-1] = len+4;
		
		assertFalse(Inverse.Inverse(x, y));
	}
}
