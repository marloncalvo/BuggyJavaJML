
import static org.junit.Assert.*;
import org.junit.Test;
public class FindFirstZeroTest {
	@Test
	void test() {
		int [] x = new int[1];
		x[0] = 11;
		assertEquals(FindFirstZero.FindFirstZero(x), -1);
	}

}
