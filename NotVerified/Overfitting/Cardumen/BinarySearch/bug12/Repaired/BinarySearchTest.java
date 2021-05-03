
import static org.junit.Assert.*;
import org.junit.Test;
public class BinarySearchTest {
	@Test
	void test() {
        int [] arr = {-1};
        int key = 0;
        assertEquals(BinarySearch.Binary(arr, key), -1);
	}

}
