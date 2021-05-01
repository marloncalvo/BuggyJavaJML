package ArjaE.StackQueue.bug61.Repaired;

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
		repeat(() -> {
			stack.push(0);
		}, 63);
		repeat(() -> {
			stack.push(-2147477598);
		}, 1);
		int oldTop = stack.getTop();
		int res = stackStackQueue.driverStack(stack, 4, -12321);

		assertEquals(-2147477598, res);
		assertEquals(oldTop - 1, stack.getTop());
	}

}
