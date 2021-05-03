package ArjaE.BubbleSort.bug6.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ArjaE.BubbleSort.bug9.Repaired.SwapInArray;

class SwapInArrayTest {

	@Test
	void test() {
		int [] array = get_array_0();
		int [] oldArray = get_array_0();
		int x = 2438;
		int y = 2437;
		SwapInArray sia = new SwapInArray();
		sia.swap(x, y, array);
		
		assertEquals(oldArray[x], array[y]);
		assertEquals(oldArray[y], array[x]);
	}

	int [] get_array_0() {
		int [] array = new int[2439];
		array[2438] = 12;
		array[2437] = 10;
		return array;
	}
}
