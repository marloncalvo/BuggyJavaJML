package Structural.Cardumen.BinarySearch.bug10.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	/**
	 * Not testable since the failed assertion is dealing with internal assume 
	 * statements which does not affect correctness of result.
	 */
	void test() {
		int [] arr = new int[1954];
		Arrays.fill(arr, -2147481365);
		int key = -2147481366;
		assertEquals(-1, BinarySearch.Binary(arr, key));
	}

}
