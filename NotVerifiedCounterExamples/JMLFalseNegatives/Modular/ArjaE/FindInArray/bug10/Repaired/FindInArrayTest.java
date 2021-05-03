package Modular.ArjaE.FindInArray.bug10.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindInArrayTest {

	@Test
	/**
	 * Counterexample information stops after invalid assertion of `setKey` in
	 * findLast().
	 */
	void test() {
		int [] inputArr = new int[10035];
		int key = -2147475549;
		FindInArray fia = new FindInArray(inputArr, key);
		assertEquals(fia.findLast(), -1);
	}

}
