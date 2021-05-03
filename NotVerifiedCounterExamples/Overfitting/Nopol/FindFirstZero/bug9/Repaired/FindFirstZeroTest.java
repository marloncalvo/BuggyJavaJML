package Nopol.FindFirstZero.bug9.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindFirstZeroTest {

	@Test
	void test() {
		int [] x = new int[1];
		x[0] = 11;
		assertEquals(FindFirstZero.FindFirstZero(x), -1);
	}

}
