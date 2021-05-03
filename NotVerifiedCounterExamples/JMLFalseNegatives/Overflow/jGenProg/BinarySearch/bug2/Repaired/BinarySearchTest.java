package Overflow.jGenProg.BinarySearch.bug2.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	void test() {
		int [] arr = new int[1073741824];
		int key = -1;
		assertEquals(BinarySearch.Binary(arr, key), -1);
	}

}
