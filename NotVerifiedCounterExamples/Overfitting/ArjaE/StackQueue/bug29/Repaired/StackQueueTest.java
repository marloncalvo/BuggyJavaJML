package ArjaE.StackQueue.bug29.Repaired;

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

		StackQueue oldQueueStackQueue = new StackQueue();
		StackQueue.Queue oldQueue = oldQueueStackQueue.new Queue();

		assertThrows(IllegalArgumentException.class, () -> {
			queue.delete();
		});
	}

	/*
	
	*/
	@Test
	void test1() {
		StackQueue queueStackQueue = new StackQueue();
		StackQueue.Queue queue = queueStackQueue.new Queue();
		repeat(() -> {
			queue.enter(0);
		}, 1);
		repeat(() -> {
			queue.enter(1);
		}, 1);
		repeat(() -> {
			queue.enter(2);
		}, 1);
		repeat(() -> {
			queue.enter(0);
		}, 97);
		StackQueue oldQueueStackQueue = new StackQueue();
		StackQueue.Queue oldQueue = oldQueueStackQueue.new Queue();
		repeat(() -> {
			oldQueue.enter(0);
		}, 1);
		repeat(() -> {
			oldQueue.enter(1);
		}, 1);
		repeat(() -> {
			oldQueue.enter(2);
		}, 1);
		repeat(() -> {
			oldQueue.enter(0);
		}, 97);
		assertDoesNotThrow(() -> {
			int res = queue.delete();
			assertEquals(99, queue.getRear());
			assertEquals(0, res);
			for (int i = 0; i < 100; i++) {
				assertEquals(oldQueue.getElem(i + 1), queue.getElem(i));
			}
		});
	}

}
