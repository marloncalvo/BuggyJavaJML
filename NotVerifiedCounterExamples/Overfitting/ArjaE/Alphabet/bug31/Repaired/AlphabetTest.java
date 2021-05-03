package ArjaE.Alphabet.bug31.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlphabetTest {

	@Test
	void case1() {
		char c = 'a';
		int op = 4;
		Alphabet driver = new Alphabet(c);
		assertTrue(driver.isAlphabetic());
		assertTrue(driver.isVowel());
		assertTrue(driver.getAlphabetic_set());
	}

	@Test
	/**
	 * Specific test case is different, but it's checking that uppercase
	 * should not be changed in lowercase, so we will transform to that.
	 */
	void case2() {
		char c = 'A'; // original is '`'
		int op = 4;
		Alphabet driver = new Alphabet(c);
		assertFalse(driver.isLowercase());
		assertFalse(driver.uppercase); // must not have been set
	}
}
