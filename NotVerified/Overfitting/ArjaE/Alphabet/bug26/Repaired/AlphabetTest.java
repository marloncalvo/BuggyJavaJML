
import static org.junit.Assert.*;
import org.junit.Test;
public class AlphabetTest {
	@Test
	/**
	 * Although a bug, it does not run into issues because in lowercase_set,
	 * alphabet is changed instead of lowercase... which is what is used in isLowercase.
	 */
	void case1() {
		Alphabet alphabet = new Alphabet('a');
		assertTrue(alphabet.isLowercase() && alphabet.getLowercase_set());
	}

}
