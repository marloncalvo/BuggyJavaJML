package jGenProg.BinarySearch.bug11.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	/**
	 * Array too big
	 */
	void test() {
        int size = 2147483647; // too big for my machine, can't run
        int [] arr = new int[size];
        assertEquals(BinarySearch.Binary(arr, 1), -1);
	}

}
