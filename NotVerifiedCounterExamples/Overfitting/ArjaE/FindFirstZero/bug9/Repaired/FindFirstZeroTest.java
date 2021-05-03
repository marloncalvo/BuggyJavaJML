package ArjaE.FindFirstZero.bug9.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindFirstZeroTest {

	/*
	
	*/
	@Test
	void test0() {
		int[] arr = get_array_0();
		int res = FindFirstZero.FindFirstZero(arr);
		assertEquals(-1, res);
	}

	int[] get_array_0() {
		return new int[] { 11 };
	}

}
