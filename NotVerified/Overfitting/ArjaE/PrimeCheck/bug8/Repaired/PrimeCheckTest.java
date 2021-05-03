
import static org.junit.Assert.*;
import org.junit.Test;
public class PrimeCheckTest {
	@Test
	void test() {
		int a = 2;
		PrimeCheck prime = new PrimeCheck();
		assertTrue(prime.isPrime(a));
	}

}
