package ArjaE.BubbleSort.bug5.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

	/**
	 * Heap size needs to be increased, but it is valid for Java.
	 */
	@Test
	void test() {
		int [] array = new int[1073741948];
		for (int i = 0; i < array.length; i++) {
			array[i] = array.length - 1;
		}
		
		array = new BubbleSort().bubbleSort(array);
		
		for (int i = 1; i < array.length; i++) {
			assertTrue(array[i-1] <= array[i]);
		}
	}
	
	/**
	 * Possible OpenJML false negative.
	 */
	@Test
	void test0() {
		int [] array = new int[13868];
		for (int i = 0; i < array.length; i++) {
			array[i] = array.length - i;
		}
		
		array = new BubbleSort().bubbleSort(array);
		
		for (int i = 1; i < array.length; i++) {
			assertTrue(array[i-1] <= array[i]);
		}
	}

}
