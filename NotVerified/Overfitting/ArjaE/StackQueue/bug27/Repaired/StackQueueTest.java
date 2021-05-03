
import static org.junit.Assert.*;
import org.junit.Test;
public class StackQueueTest {
	void repeat(Runnable r, int times) {
		for (int i = 0; i < times; i++) {
			r.run();
		}
	}

	/*
	 * Assumes we can build queue of size 100
	 */
	@Test
	void test0() {
		fail("The function queue_enter() is not testable for this case");
	}

	/*
	 * False negative because isFull always true.
	 */
	@Test
	void test1() {
		StackQueue queueStackQueue = new StackQueue();
		StackQueue.Queue queue = queueStackQueue.new Queue();

		assertDoesNotThrow(() -> {
			queue.enter(-12321);
			assertEquals(1, queue.getRear());
			assertEquals(-12321, queue.getElem(0));
		});
	}

	/*
	
	*/
	@Test
	void test2() {
		StackQueue queueStackQueue = new StackQueue();
		StackQueue.Queue queue = queueStackQueue.new Queue();
		repeat(() -> {
			queue.enter(0);
		}, 99);
		assertFalse(queue.isFull());
	}

}
