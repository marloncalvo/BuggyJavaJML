package Cardumen.BinarySearch.bug11.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	void test() {
		int [] arr = {0};
		int key = 1;
		assertEquals(BinarySearch.Binary(arr, key), -1);
	}

}
