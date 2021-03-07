package KaliA.Inverse.bug2.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InverseTest {

	@Test
	void test() {
		int len = 1796;
		int [] x = new int[len], y = new int[len];
		x[0] = y[len-0-1] = 1796;
		x[x[0]] = y[len-x[0]-1] = 0;
		x[1] = -1;
		
		assertFalse(Inverse.Inverse(x, y));
	}

}
