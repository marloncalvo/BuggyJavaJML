package ArjaE.Alphabet.bug5.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlphabetTest {

	@Test
	void case1() {
		char c = 'e';
		Alphabet driver = new Alphabet(c);
		assertFalse(driver.isUppercase());
		assertFalse(driver.getUppercase_set());
	}

}
