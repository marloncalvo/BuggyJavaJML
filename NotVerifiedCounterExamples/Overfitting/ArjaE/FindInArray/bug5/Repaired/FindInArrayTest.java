package ArjaE.FindInArray.bug5.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindInArrayTest {

	/*
	
	*/
	@Test
	void test0() {

		int[] array = get_array_0();
		int key = 0;
		FindInArray fia = new FindInArray(array, key);
		assertEquals(0, fia.findLast());
	}

	int[] get_array_0() {
		return new int[] { 0 };
	}

}
