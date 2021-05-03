
import static org.junit.Assert.*;
import org.junit.Test;
public class AlphabetTest {
	@Test
	void test() {
        Alphabet alphabet = new Alphabet('B');
        assertFalse(alphabet.isVowel());
	}

}
