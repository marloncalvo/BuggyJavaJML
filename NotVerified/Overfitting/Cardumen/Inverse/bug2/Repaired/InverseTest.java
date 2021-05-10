
import static org.junit.Assert.*;
import org.junit.Test;
public class InverseTest {
	@Test
	/**
	 * Out of heap memory for all cases.
	 */
	public void test() {
		int len = 214748121;
		int [] x = new int[len];
		int [] y = new int[len];
		
		x[0] = y[len-0-1] = 1;
		x[1] = y[len-1-1] = -1;
		x[2] = 3;
		
		assertFalse(Inverse.Inverse(x, y));
	}

}
