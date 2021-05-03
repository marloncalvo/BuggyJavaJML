
import static org.junit.Assert.*;
import org.junit.Test;
public class FactorialTest {
	@Test
	/**
	 * C blows up to integer max value for no reason.
	 */
	void test() {
		int n = 3;
		assertEquals(6, new Factorial().factorial(n));
	}

	
	/**
	 * In other cases fact blows up for no reason, even for low n's.
	 */
	
	/**
	 * Factorial does not grow, and only equals n.
	 */
	void test1() {
		int n = 8;
		assertEquals(40320, new Factorial().factorial(n));
	}
}
