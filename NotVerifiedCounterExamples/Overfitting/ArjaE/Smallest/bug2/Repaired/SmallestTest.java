package ArjaE.Smallest.bug2.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ArjaE.Smallest.bug1.Repaired.Smallest;

class SmallestTest {

	@Test
	void test() {
		int[] array = {};
		assertEquals(-1, Smallest.Smallest(array));
	}

}
