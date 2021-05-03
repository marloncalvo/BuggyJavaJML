
import static org.junit.Assert.*;
import org.junit.Test;
public class FindFirstZeroTest {
	/*
	
	*/
	@Test
	void test0() {
		int[] arr = get_array_0();
		int res = FindFirstZero.FindFirstZero(arr);
		assertEquals(-1, res);
	}

	int[] get_array_0() {
		return new int[] { 11 };
	}

}
