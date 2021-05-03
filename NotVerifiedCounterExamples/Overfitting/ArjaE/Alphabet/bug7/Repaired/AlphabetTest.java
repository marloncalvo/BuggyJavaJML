package ArjaE.Alphabet.bug7.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlphabetTest {

	@Test
	void case1() {
		char c = 'e';
		Alphabet driver = new Alphabet(c);
		assertFalse(driver.getLowercase_set());
	}
	
	@Test
	void case2() {
		char c = 'a';
		Alphabet driver = new Alphabet(c);
		assertTrue(driver.isLowercase());
		assertTrue(driver.lowercase_set);
	}

}
