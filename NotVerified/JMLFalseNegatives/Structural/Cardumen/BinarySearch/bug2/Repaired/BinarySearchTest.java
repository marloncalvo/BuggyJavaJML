
import static org.junit.Assert.*;
import java.util.Arrays;

import org.junit.Test;
public class BinarySearchTest {
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
