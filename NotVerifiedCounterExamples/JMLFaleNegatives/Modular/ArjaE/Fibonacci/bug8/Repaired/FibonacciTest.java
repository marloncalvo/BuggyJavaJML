package Modular.ArjaE.Fibonacci.bug8.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

	@Test
	void test() {
		Fibonacci fib = new Fibonacci();
		long res = fib.getFib(1);
		assertEquals(res, 1);
		System.out.println("Not assertable due to internal OpenJML issue, where it "
				+ "does not recognize that index is bounded by the array's length");
	}

}
