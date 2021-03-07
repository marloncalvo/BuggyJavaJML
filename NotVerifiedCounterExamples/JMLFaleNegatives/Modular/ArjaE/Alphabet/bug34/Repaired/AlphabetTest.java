package Modular.ArjaE.Alphabet.bug34.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlphabetTest {

	@Test
	void case1() {
		Alphabet alphabet = new Alphabet('a');
		assertTrue(alphabet.isAlphabetic());
		System.out.println("seems to be internal error of openjml, where it assumes"
				+ "that uppercase=(...) is assigned true, thus not assertable");
	}

}
