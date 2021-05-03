
import static org.junit.Assert.*;
import org.junit.Test;
public class PrimeNumbersTest {
	@Test
	/**
	 * Counter example says that j == 0 when calling div(num, j) which is not possible
	 */
	void test() {
		int [] primes = new PrimeNumbers().primeList(105101833);
		
	}
	
	/**
	 * Test case wrongly assumes that although div(45, 9) === true, and changes
	 * status to 0, it does not persist that during the check if (status > 0), where it executes to true.
	 */
	void test1() {
		int [] primes = new PrimeNumbers().primeList(8180);
	}

}
