
import static org.junit.Assert.*;
import org.junit.Test;
public class LinearSearchTest {
	@Test
	/**
	 * Counter example shows c == -1 when checking maintaining clause at 18.
	 */
	void test() {
		int [] array = new int[8856];
		int search = 0;
		assertEquals(0, LinearSearch.linearSearch(search, array));
	}
	
	/**
	 * Same thing
	 */
	void test1() {
		int [] array = new int[450];
		int search = 1;
		array[0] = 1;
		assertEquals(0, LinearSearch.linearSearch(search, array));
	}

	/**
	 * Does not use right bounds for c in loop at 24.
	 */
	void test2() {
		int [] array = new int[616];
		int search = 1;
		array[449] = 1;
		array[168] = 1;
		assertEquals(168, LinearSearch.linearSearch(search, array));
	}
}
