package ArjaE.StackQueue.bug82.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackQueueTest {

	void repeat(Runnable r, int times) {
		for (int i = 0; i < times; i++) {
			r.run();
		}
	}

	/*
	 * False negative by OpenJML due to bug...
	 */
	@Test
	void test0() {
		StackQueue queueStackQueue = new StackQueue();
		StackQueue.Queue queue = queueStackQueue.new Queue();
		repeat(() -> {
			queue.enter(0);
		}, 1);
		repeat(() -> {
			queue.enter(515);
		}, 1);
		repeat(() -> {
			queue.enter(0);
		}, 3);
		int oldRes = queue.getElem(queue.getFront()) / queue.getElem(queue.getFront() + 1);
		int oldSize = queue.size();
		int res = queueStackQueue.QDivision(queue);
		assertEquals(oldRes, res);
		assertEquals(oldSize - 1, queue.size());
	}

	/*
	 * Not frame test case, but derived from
	 */
	@Test
	void test1() {
		StackQueue queueStackQueue = new StackQueue();
		StackQueue.Queue queue = queueStackQueue.new Queue();
		repeat(() -> {
			queue.enter(515);
		}, 1);
		repeat(() -> {
			queue.enter(3);
		}, 1);
		repeat(() -> {
			queue.enter(0);
		}, 3);
		int oldRes = queue.getElem(queue.getFront()) / queue.getElem(queue.getFront() + 1);
		int oldSize = queue.size();
		int res = queueStackQueue.QDivision(queue);
		assertEquals(oldRes, res);
		assertEquals(oldSize - 1, queue.size());
	}

}
