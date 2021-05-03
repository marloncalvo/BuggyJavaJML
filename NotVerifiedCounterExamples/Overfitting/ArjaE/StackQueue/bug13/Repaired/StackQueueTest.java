package ArjaE.StackQueue.bug13.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackQueueTest {
	void repeat(Runnable r, int times) {
		for (int i = 0; i < times; i++) {
			r.run();
		}
	}

	@Test
	void test0() {
		StackQueue stackStackQueue = new StackQueue();
		StackQueue.Stack stack = stackStackQueue.new Stack();
		repeat(() -> {
			stack.push(1);
		}, 1);
		repeat(() -> {
			stack.push(0);
		}, 1);
		assertEquals(0, stack.search(1));
	}

//==============================================================================

}
