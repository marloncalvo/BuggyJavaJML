
import static org.junit.Assert.*;
import org.junit.Test;
public class InverseTest {
	@Test
	void test() {
		int len = 2439;
		int [] x = new int[len], y = new int[len];
		x[0] = y[len-x[0]-1] = 1;
		x[x[0]] = 12;
		y[len-x[0]-1] = 13;
		
		assertFalse(Inverse.Inverse(x, y));
	}

}
