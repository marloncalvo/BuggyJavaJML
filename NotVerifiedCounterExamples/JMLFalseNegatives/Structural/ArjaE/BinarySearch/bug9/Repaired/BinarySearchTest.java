package Structural.ArjaE.BinarySearch.bug9.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	/**
	 * Correct output, but performs linear search
	 */
	void test() {
		int [] arr = new int[35390];
		int key = 0;
		Arrays.fill(arr, 1);
		assertEquals(BinarySearch.Binary(arr, key), -1);
	}

}
