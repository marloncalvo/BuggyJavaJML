package ArjaE.PrimeCheck.bug8.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeCheckTest {

	@Test
	void test() {
		int a = 2;
		PrimeCheck prime = new PrimeCheck();
		assertTrue(prime.isPrime(a));
	}

}
