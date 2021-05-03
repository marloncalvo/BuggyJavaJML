package Structural.ArjaE.PrimeNumbers.bug3.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumbersTest {

	@Test
	/**
	 * Somehow the check for div(4,2) is not being performed, so status is not changed
	 * to zero.
	 */
	void test() {
		int [] primes = new PrimeNumbers().primeList(5);
	}
	
	/**
	 * Somehow sets the status to be === -1, which is not possible.
	 * This is ok since it is done when desired.
	 * 
	 * Also sets count to be -2147483648 which is not possible, messing up
	 * indexing of array.
	 */
	void test1() {
		int [] primes = new PrimeNumbers().primeList(105102357);
	}

	/**
	 * The rest of the issues are variations of the described issues above.
	 */
	
	/**
	 * Counter incremented to three twice.
	 */
	void test2() {
		int [] primes = new PrimeNumbers().primeList(3);
		assertArrayEquals(new int[] {2,3,5}, primes);
	}
}
