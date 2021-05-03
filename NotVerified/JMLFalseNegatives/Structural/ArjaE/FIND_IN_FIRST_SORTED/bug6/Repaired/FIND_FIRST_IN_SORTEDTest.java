
import static org.junit.Assert.*;
import org.junit.Test;
public class FIND_FIRST_IN_SORTEDTest {
	@Test
	/**
	 * Changes values for low and high while entering second while loop... weird.
	 */
	void test() {
		int [] arr = new int[1073741824];
		int x = 1;
		assertEquals(-1, FIND_FIRST_IN_SORTED.find_first_in_sorted(arr, x));
	}

	@Test
	/**
	 * Changes values for low and high while entering second while loop... weird.
	 */
	void test1() {
		int [] arr = new int[1073741824];
		int x = 1;
		assertEquals(-1, FIND_FIRST_IN_SORTED.find_first_in_sorted(arr, x));
	}
	
	void test2() {
		int [] arr = new int[1073741824];
		int x = -2147479692;
	}
}
