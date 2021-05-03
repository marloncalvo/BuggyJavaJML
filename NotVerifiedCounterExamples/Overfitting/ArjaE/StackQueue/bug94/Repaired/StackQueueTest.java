package ArjaE.StackQueue.bug94.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackQueueTest {

	void repeat(Runnable r, int times) {
		for (int i = 0; i < times; i++) {
			r.run();
		}
	}

	/*
	 * inputs are out of int range
	 */
	@Test
	void test0() {
		fail("The function driverqstack() is not testable for this case");
	}

	/*
	 * inputs are out of int range
	 */
	@Test
	void test1() {
		fail("The function driverqstack() is not testable for this case");
	}

}
