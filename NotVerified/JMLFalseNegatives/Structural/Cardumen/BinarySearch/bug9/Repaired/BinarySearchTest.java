
import static org.junit.Assert.*;
import java.util.Arrays;

import org.junit.Test;
public class BinarySearchTest {
	@Test
	void test() {
		int [] arr = new int[1954];
		int key = -2147475550;
		Arrays.fill(arr, -2147475549);
		assertEquals(-1, BinarySearch.Binary(arr, key));
	}

}
