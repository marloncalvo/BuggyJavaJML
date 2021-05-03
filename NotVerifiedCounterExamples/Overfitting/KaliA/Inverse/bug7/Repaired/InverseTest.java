package KaliA.Inverse.bug7.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InverseTest {

	@Test
	void test() {
        int len = 2046;
        int [] x = new int[len];
        int [] y = new int[len];

        x[0] = y[len-1] = 1864;
        x[1846] = y[len-1864-1] = 11;
        x[11] = -1;

        assertFalse(Inverse.Inverse(x, y));
	}

}
