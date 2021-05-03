package ArjaE.StackQueue.bug39.Repaired;

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
		StackQueue queueStackQueue = new StackQueue();
		StackQueue.Queue queue = queueStackQueue.new Queue();
		repeat(() -> {
			queue.enter(-2147483610);
		}, 1);
		int oldFront = queue.getFront();
		int oldRear = queue.getRear();
		int[] res = { -1 };
		assertDoesNotThrow(() -> {
			res[0] = queue.peek();
		});
		assertEquals(-2147483610, res[0]);
		assertEquals(oldRear, queue.getRear());
	}

	/*
	
	*/
	@Test
	void test1() {
		StackQueue queueStackQueue = new StackQueue();
		StackQueue.Queue queue = queueStackQueue.new Queue();
		repeat(() -> {
			queue.enter(-2147483610);
		}, 1);
		repeat(() -> {
			queue.enter(0);
		}, 2);
		int oldFront = queue.getFront();
		int oldRear = queue.getRear();
		int[] res = { -1 };
		assertDoesNotThrow(() -> {
			res[0] = queue.peek();
		});
		assertEquals(-2147483610, res[0]);
		assertEquals(oldRear, queue.getRear());
	}

	/*
	
	*/
	@Test
	void test2() {
		StackQueue queueStackQueue = new StackQueue();
		StackQueue.Queue queue = queueStackQueue.new Queue();
		repeat(() -> {
			queue.enter(-2147483610);
		}, 1);
		repeat(() -> {
			queue.enter(0);
		}, 92);
		int oldFront = queue.getFront();
		int oldRear = queue.getRear();
		int[] res = { -1 };
		assertDoesNotThrow(() -> {
			res[0] = queue.peek();
		});
		assertEquals(-2147483610, res[0]);
		assertEquals(oldRear, queue.getRear());
	}

	/*
	
	*/
	@Test
	void test3() {
		StackQueue queueStackQueue = new StackQueue();
		StackQueue.Queue queue = queueStackQueue.new Queue();
		repeat(() -> {
			queue.enter(21);
		}, 1);
		repeat(() -> {
			queue.enter(0);
		}, 74);
		int oldFront = queue.getFront();
		int oldRear = queue.getRear();
		int[] res = { -1 };
		assertDoesNotThrow(() -> {
			res[0] = queue.peek();
		});
		assertEquals(21, res[0]);
		assertEquals(oldRear, queue.getRear());
	}

}
