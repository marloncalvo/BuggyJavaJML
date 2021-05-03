package ArjaE.BinarySearch.bug4.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	void test() {
		int [] array = new int[11811];
		array[0] = -1;
		
		int res = BinarySearch.Binary(array, -1);
		
		assertEquals(0, res);
	}

	/**
	 * The counterexample array is too large. Denotes same problem as previous case.
	 */
	@Test
	void test0() {
		fail("The function Binary() is not testable for this case");
	}
}
