package Structural.ArjaE.Factorial.bug2.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		int n = 19;
		assertEquals(new Factorial().factorial(n), 121645100408832000L);
	}

	@Test
	void test1() {
		int n = 20;
		assertEquals(new Factorial().factorial(n), 2432902008176640000L);
	}
}
