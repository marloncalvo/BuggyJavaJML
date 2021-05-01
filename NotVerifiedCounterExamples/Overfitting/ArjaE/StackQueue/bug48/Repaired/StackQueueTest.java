package ArjaE.StackQueue.bug48.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackQueueTest {

	void repeat(Runnable r, int times) {
		for (int i = 0; i < times; i++) {
			r.run();
		}
	}

	/*
	 * False negative by OpenJML
	 */
	@Test
	void test0() {
		StackQueue queueStackQueue = new StackQueue();
		StackQueue.Queue queue = queueStackQueue.new Queue();
		repeat(() -> {
			queue.enter(0);
		}, 51);
		repeat(() -> {
			queue.enter(-2147475550);
		}, 1);
		assertEquals(51, queue.search(-2147475550));
		assertEquals(-2147475550, queue.getElem(51));
	}

	/*
	 * False negative by OpenJML
	 */
	@Test
	void test1() {
		StackQueue queueStackQueue = new StackQueue();
		StackQueue.Queue queue = queueStackQueue.new Queue();
		repeat(() -> {
			queue.enter(0);
		}, 31);
		repeat(() -> {
			queue.enter(-2147475550);
		}, 1);
		repeat(() -> {
			queue.enter(0);
		}, 20);
		assertEquals(31, queue.search(-2147475550));
		assertEquals(-2147475550, queue.getElem(31));
	}

}
