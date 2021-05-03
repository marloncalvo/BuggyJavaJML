
import static org.junit.Assert.*;
import org.junit.Test;
public class BinarySearchTest {
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
