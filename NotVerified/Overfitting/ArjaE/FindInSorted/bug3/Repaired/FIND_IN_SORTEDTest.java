
import static org.junit.Assert.*;
import org.junit.Test;
public class FIND_IN_SORTEDTest {
	/*
	 * With the input provided, it will not fail since it will perform linear search
	 * after it encounters x > arr[mid] situation. This linear search will then only
	 * stop if we find an element smaller than x, i.e. the element was not found.
	 * Requires another test case which will fail if x is bigger than all elements.
	 */
	@Test
	void test0() {
		fail("The function binsearch() is not testable for this case");
	}

	/*
	
	*/
	@Test
	void test1() {
		int[] array = get_array_1();
		int start = 0;
		int end = 1;
		int x = 100;
		int res = FIND_IN_SORTED.binsearch(array, x, start, end);
		assertEquals(-1, res);
	}

	int[] get_array_1() {
		return new int[] { 0 };
	}

}
