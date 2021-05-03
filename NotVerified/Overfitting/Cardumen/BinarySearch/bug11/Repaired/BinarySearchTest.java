
import static org.junit.Assert.*;
import org.junit.Test;
public class BinarySearchTest {
	@Test
	void test() {
		int [] arr = {0};
		int key = 1;
		assertEquals(BinarySearch.Binary(arr, key), -1);
	}

}
