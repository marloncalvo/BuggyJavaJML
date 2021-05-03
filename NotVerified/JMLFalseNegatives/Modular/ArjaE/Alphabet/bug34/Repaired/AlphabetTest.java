
import static org.junit.Assert.*;
import org.junit.Test;
public class AlphabetTest {
	@Test
	/**
	 * Failing because uppercase is changed, without being an assignable variable.
	 */
	void case1() {
		char c = 'A';
		Alphabet alphabet = new Alphabet(c);
		assertTrue(alphabet.isAlphabetic());
		assertFalse(alphabet.uppercase);
	}

}
