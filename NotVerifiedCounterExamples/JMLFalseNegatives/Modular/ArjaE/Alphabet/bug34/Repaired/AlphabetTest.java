package Modular.ArjaE.Alphabet.bug34.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlphabetTest {

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
