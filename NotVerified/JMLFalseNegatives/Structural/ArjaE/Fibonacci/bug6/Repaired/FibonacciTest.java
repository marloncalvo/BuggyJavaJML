
import static org.junit.Assert.*;
import org.junit.Test;
public class FibonacciTest {
	@Test
	/**
	 * Weird case, since it only fails to verify within the fibCompute.
	 * No test case can be generated.
	 */
	void test() {
		int size = 2;
		int index = 1;
		Fibonacci f = new Fibonacci(size);
		f.fibCompute();
		assertEquals(1, f.getFib(index));
	}

}
