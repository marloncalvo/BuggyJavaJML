
import static org.junit.Assert.*;
import java.util.Arrays;

import org.junit.Test;
public class BinarySearchTest {
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
