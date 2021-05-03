
import static org.junit.Assert.*;
import org.junit.Test;
public class FindInArrayTest {
	@Test
	/**
	 * Counterexample information stops after invalid assertion of `setKey` in
	 * findLast().
	 */
	void test() {
		int [] inputArr = new int[10035];
		int key = -2147475549;
		FindInArray fia = new FindInArray(inputArr, key);
		assertEquals(fia.findLast(), -1);
	}

}
