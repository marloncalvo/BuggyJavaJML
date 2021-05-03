package Cardumen.BinarySearch.bug12.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	void test() {
        int [] arr = {-1};
        int key = 0;
        assertEquals(BinarySearch.Binary(arr, key), -1);
	}

}
