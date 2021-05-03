
import static org.junit.Assert.*;
import org.junit.Test;
public class PrimeNumbersTest {
	@Test
	void case1() {
		int n = 2147483647;
		int d = -2;
		assertFalse(PrimeNumbers.div(n, d));
	}
	
	@Test
	/**
	 * Not sure yet.
	 */
	void case2() {
		int n = 105097276;
		int [] res = new PrimeNumbers().primeList(n);
		fail("not implemented");
	}

}
