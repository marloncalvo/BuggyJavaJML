
import static org.junit.Assert.*;
import org.junit.Test;
public class BinarySearchTest {
	@Test
	void test() {
		int [] arr = new int[1073741824];
		int key = -1;
		assertEquals(BinarySearch.Binary(arr, key), -1);
	}

}
