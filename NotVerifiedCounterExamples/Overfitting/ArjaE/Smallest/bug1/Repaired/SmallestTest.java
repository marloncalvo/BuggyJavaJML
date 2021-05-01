package ArjaE.Smallest.bug1.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmallestTest {

	@Test
	void test() {
		int[] array = {};
		assertEquals(-1, Smallest.Smallest(array));
	}

}
