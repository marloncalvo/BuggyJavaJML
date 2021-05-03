
import static org.junit.Assert.*;
import org.junit.Test;
public class Counterexample {
	@Test
	/**
	 * It seems that it only complains for this case, since case2 fails.
	 * This may be unnecessary.
	 */
	void case1() {
		Alphabet alphabet = new Alphabet('a');
		boolean [] res = alphabet.driver(0);
		assertTrue(res[0] && res[1]);
	}
	
	@Test
	void case2() {
		Alphabet alphabet = new Alphabet('j');
		assertTrue(alphabet.isVowel() && alphabet.getVowel_set());
	}

}
