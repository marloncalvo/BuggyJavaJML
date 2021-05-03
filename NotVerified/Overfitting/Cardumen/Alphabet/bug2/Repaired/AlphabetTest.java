package Cardumen.Alphabet.bug2.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlphabetTest {

	@Test
	void test() {
        Alphabet alphabet = new Alphabet('B');
        assertFalse(alphabet.isVowel());
	}

}
