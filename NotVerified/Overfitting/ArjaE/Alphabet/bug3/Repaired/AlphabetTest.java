
import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Had to set alphabetic to protected for visibility
 * @author marloncalvo
 *
 */
public class AlphabetTest {
	@Test
	void case1() {
		char c = '{';
		int op = 2;
		Alphabet alphabet = new Alphabet(c);
		boolean [] res = alphabet.driver(op);
		assertFalse(res[5]);
	}

	
	@Test
	void case2() {
		char c = 'B';
		int op = 2;
		Alphabet alphabet = new Alphabet(c);
		boolean [] res = alphabet.driver(op);
		assertFalse(res[5]);
	}

	@Test
	void case3() {
		char c = 'A';
		int op = 1;
		Alphabet alphabet = new Alphabet(c);
		boolean [] res = alphabet.driver(op);
		assertFalse(res[5]);
	}
	
	@Test
	void case4() {
		char c = '{';
		int op = 3;
		Alphabet alphabet = new Alphabet(c);
		boolean [] res = alphabet.driver(op);
		assertFalse(res[5]);
	}
	
	@Test
	void case5() {
		char c = '{';
		int op = 4;
		Alphabet alphabet = new Alphabet(c);
		boolean [] res = alphabet.driver(op);
		assertFalse(res[5]);
	}
}
