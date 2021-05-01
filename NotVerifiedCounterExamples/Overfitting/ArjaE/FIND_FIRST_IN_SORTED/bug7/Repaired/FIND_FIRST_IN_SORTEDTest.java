package ArjaE.FIND_FIRST_IN_SORTED.bug7.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FIND_FIRST_IN_SORTEDTest {

	/*
	 * OpenJML false negative
	 */
	@Test
	void test0() {
		int[] arr = get_array_0();
		int x = -12321;
		int res = FIND_FIRST_IN_SORTED.find_first_in_sorted(arr, x);
		assertEquals(-1, res);
	}

	/*
	 * OpenJML false negative
	 */
	@Test
	void test1() {
		int[] arr = get_array_1();
		int x = -12321;
		int res = FIND_FIRST_IN_SORTED.find_first_in_sorted(arr, x);
		assertEquals(-1, res);
	}

	/*
	 * OpenJML false negative
	 */
	@Test
	void test2() {
		int[] arr = get_array_2();
		int x = -2147475192;
		int res = FIND_FIRST_IN_SORTED.find_first_in_sorted(arr, x);
		assertEquals(-1, res);
	}

	/*
	 * Not from OpenJML, hand-built
	 */
	@Test
	void test3() {
		int[] arr = get_array_3();
		int x = 1;
		int res = FIND_FIRST_IN_SORTED.find_first_in_sorted(arr, x);
		assertEquals(0, res);
	}

	int[] get_array_0() {
		return new int[] {};
	}

	int[] get_array_1() {
		return new int[] { 0 };
	}

	int[] get_array_2() {
		return new int[] { -2147475193 };
	}

	int[] get_array_3() {
		return new int[] { 1 };
	}

}
