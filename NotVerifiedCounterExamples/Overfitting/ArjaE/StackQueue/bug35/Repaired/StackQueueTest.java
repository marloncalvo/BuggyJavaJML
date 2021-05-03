package ArjaE.StackQueue.bug35.Repaired;

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
		}, 1);
		repeat(() -> {
			queue.enter(1);
		}, 1);
		repeat(() -> {
			queue.enter(2);
		}, 1);
		repeat(() -> {
			queue.enter(0);
		}, 95);
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
		}, 95);
		int[] resArray = { -1 };
		assertDoesNotThrow(() -> {
			resArray[0] = queue.delete();
		});
		int res = resArray[0];
		assertEquals(97, queue.getRear());
		assertEquals(0, res);
		for (int i = 0; i < 98; i++) {
			assertEquals(oldQueue.getElem(i + 1), queue.getElem(i));
		}
	}

}
