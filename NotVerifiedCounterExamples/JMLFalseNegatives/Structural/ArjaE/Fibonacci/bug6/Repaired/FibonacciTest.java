package Structural.ArjaE.Fibonacci.bug6.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

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
