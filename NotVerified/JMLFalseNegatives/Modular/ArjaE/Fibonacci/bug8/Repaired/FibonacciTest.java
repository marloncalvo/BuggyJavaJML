
import static org.junit.Assert.*;
import org.junit.Test;
public class FibonacciTest {
	@Test
	void test() {
		Fibonacci fib = new Fibonacci();
		long res = fib.getFib(1);
		assertEquals(res, 1);
		System.out.println("Not assertable due to internal OpenJML issue, where it "
				+ "does not recognize that index is bounded by the array's length");
	}

}
