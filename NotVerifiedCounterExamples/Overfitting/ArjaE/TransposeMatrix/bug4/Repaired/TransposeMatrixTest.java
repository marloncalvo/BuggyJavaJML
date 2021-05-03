package ArjaE.TransposeMatrix.bug4.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TransposeMatrixTest {

	/**
	 * Arrays too large.
	 */
	@Test
	void test() {
		fail("The function transposeMat() is not testable for this case");
	}
	
	/**
	 * OpenJML false negative. Code may be correct?
	 */
	@Test
	void test0() {
		int [][] array = new int[1654][6600];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = array.length * i + j;
			}
		}
		
		int [][] result = new TransposeMatrix().transposeMat(array);
		
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				assertEquals(array[j][i], result[i][j]);
			}
		}
		
		assertEquals(array.length, result[0].length);
		assertEquals(array[0].length, result.length);
	}
}
