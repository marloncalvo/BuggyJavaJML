package ArjaE.StackQueue.bug3.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackQueueTest {

	void repeat(Runnable r, int times) {
		for (int i = 0; i < times; i++) {
			r.run();
		}
	}

	/*
	
	*/
	@Test
	void test0() {
		StackQueue stackStackQueue = new StackQueue();
		StackQueue.Stack stack = stackStackQueue.new Stack();

		assertTrue(stack.isEmpty());
	}

}
