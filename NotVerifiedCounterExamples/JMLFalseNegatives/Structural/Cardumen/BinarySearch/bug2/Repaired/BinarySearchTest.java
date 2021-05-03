package Structural.Cardumen.BinarySearch.bug2.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	void test() {
		int [] arr = new int[3];
		for (int i = 0; i < 3; i++) arr[i] = i;
		
		int key = 2;
		int index = Arrays.binarySearch(arr, key);
		
		assertEquals(BinarySearch.Binary(arr, key), index);
		
		// algorithm works, but it is not correct.
	}

}
