package ArjaE.StackQueue.bug93.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackQueueTest {

	void repeat(Runnable r, int times) {
		for (int i = 0; i < times; i++) {
			r.run();
		}
	}

	/*
	 * Use default as three to avoid / 0
	 */
	@Test
	void test0() {
		StackQueue queueStackQueue = new StackQueue();
		StackQueue.Queue queue = queueStackQueue.new Queue();
		repeat(() -> {
			queue.enter(-54);
		}, 1);
		repeat(() -> {
			queue.enter(3);
		}, 10);
		StackQueue stackStackQueue = new StackQueue();
		StackQueue.Stack stack = stackStackQueue.new Stack();
		repeat(() -> {
			stack.push(-36);
		}, 1);
		repeat(() -> {
			stack.push(3);
		}, 10);
		int res = stackStackQueue.driverQStack(stack, queue, 3);
		assertEquals(stack.peek() / queue.peek(), res);
	}

	/*
	 * Use default as three to avoid / 0
	 */
	@Test
	void test1() {
		StackQueue queueStackQueue = new StackQueue();
		StackQueue.Queue queue = queueStackQueue.new Queue();
		repeat(() -> {
			queue.enter(101);
		}, 1);
		repeat(() -> {
			queue.enter(3);
		}, 4);
		StackQueue stackStackQueue = new StackQueue();
		StackQueue.Stack stack = stackStackQueue.new Stack();
		repeat(() -> {
			stack.push(116);
		}, 1);
		repeat(() -> {
			stack.push(3);
		}, 22);
		int res = stackStackQueue.driverQStack(stack, queue, 3);
		assertEquals(stack.peek() / queue.peek(), res);
	}

}
