package jGenProg.Inverse.bug5.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InverseTest {

	@Test
	/**
	 * Array too big.
	 */
	void test() {
        int len = 1073743366;
        int [] x = new int[len], y = new int[len];

        x[0] = y[len-0-1] = 1073739386;
        x[x[0]] = 12;
        y[len-x[0]-1] = 18;

        assertFalse(Inverse.Inverse(x, y));
	}

}
