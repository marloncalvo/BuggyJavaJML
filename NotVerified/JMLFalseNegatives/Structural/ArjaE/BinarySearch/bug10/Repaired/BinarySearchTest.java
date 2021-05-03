package Structural.ArjaE.BinarySearch.bug10.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	/**
	 * Correct output, but its peforming linear search.
	 */
	void test() {
		int [] arr = new int[13856];
		int key = -2147480651;
		Arrays.fill(arr, -2147480652);
		assertEquals(BinarySearch.Binary(arr, key), -1);
	}

}
