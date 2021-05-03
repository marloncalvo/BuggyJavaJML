package ArjaE.Alphabet.bug9.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlphabetTest {

	@Test
	void case1() {
		char c = 'a';
		int op = 3;
		Alphabet driver = new Alphabet(c);
		boolean [] res = driver.driver(op);
		assertFalse(res[0]);
		assertFalse(res[4]);
	}

	@Test
	void case2() {
		char c = 'u';
		Alphabet driver = new Alphabet(c);
		assertTrue(driver.isVowel());
		assertTrue(driver.getVowel_set());
		assertTrue(driver.isAlphabetic());
		assertTrue(driver.getAlphabetic_set());
		assertFalse(driver.getDigit_set());
		assertFalse(driver.getUppercase_set());
		assertFalse(driver.isDigit());
	}
}