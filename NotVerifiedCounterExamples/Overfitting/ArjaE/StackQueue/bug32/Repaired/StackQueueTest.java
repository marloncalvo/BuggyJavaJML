package ArjaE.StackQueue.bug32.Repaired;

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
			queue.enter(30);
		}, 1);
		repeat(() -> {
			queue.enter(0);
		}, 99);
		StackQueue oldQueueStackQueue = new StackQueue();
		StackQueue.Queue oldQueue = oldQueueStackQueue.new Queue();
		repeat(() -> {
			oldQueue.enter(30);
		}, 1);
		repeat(() -> {
			oldQueue.enter(0);
		}, 99);
		int[] resArray = { -1 };
		assertDoesNotThrow(() -> {
			resArray[0] = queue.delete();
		});
		int res = resArray[0];
		assertEquals(99, queue.getRear());
		assertEquals(30, res);
		for (int i = 0; i < 99; i++) {
			assertEquals(oldQueue.getElem(i + 1), queue.getElem(i));
		}
	}

	/*
	 * OpenJML false negative
	 */
	@Test
	void test1() {
		StackQueue queueStackQueue = new StackQueue();
		StackQueue.Queue queue = queueStackQueue.new Queue();
		repeat(() -> {
			queue.enter(23);
		}, 1);
		repeat(() -> {
			queue.enter(0);
		}, 51);
		StackQueue oldQueueStackQueue = new StackQueue();
		StackQueue.Queue oldQueue = oldQueueStackQueue.new Queue();
		repeat(() -> {
			oldQueue.enter(23);
		}, 1);
		repeat(() -> {
			oldQueue.enter(0);
		}, 51);
		int[] resArray = { -1 };
		assertDoesNotThrow(() -> {
			resArray[0] = queue.delete();
		});
		int res = resArray[0];
		assertEquals(51, queue.getRear());
		assertEquals(23, res);
		for (int i = 0; i < 51; i++) {
			assertEquals(oldQueue.getElem(i + 1), queue.getElem(i));
		}
	}

}
