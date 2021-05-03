package ArjaE.StackQueue.bug54.Repaired;

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
			queue.enter(0);
		}, 100);
		int oldRear = queue.getRear();
		int oldFront = queue.getFront();
		assertThrows(IllegalArgumentException.class, () -> {
			queue.enter(-12321);
		});
		assertEquals(oldRear, queue.getRear());
		assertEquals(oldFront, queue.getFront());
	}

	/*
	
	*/
	@Test
	void test1() {
		StackQueue queueStackQueue = new StackQueue();
		StackQueue.Queue queue = queueStackQueue.new Queue();
		repeat(() -> {
			queue.enter(0);
		}, 100);
		int oldRear = queue.getRear();
		int oldFront = queue.getFront();
		assertThrows(IllegalArgumentException.class, () -> {
			queue.enter(-12321);
		});
		assertEquals(oldRear, queue.getRear());
		assertEquals(oldFront, queue.getFront());
	}

}
