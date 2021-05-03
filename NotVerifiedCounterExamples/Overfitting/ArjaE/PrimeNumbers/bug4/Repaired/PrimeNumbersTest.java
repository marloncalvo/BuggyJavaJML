package ArjaE.PrimeNumbers.bug4.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumbersTest {

	@Test
	void test() {
		int [] expected = {2, 3, 5, 7};
		int [] result = new PrimeNumbers().primeList(4);
		assertEquals(expected, result);
	}

}
