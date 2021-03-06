
import static org.junit.Assert.*;
import org.junit.Test;
public class StackQueueTest {
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
		}, 99);
		int oldRear = queue.getRear();
		int oldFront = queue.getFront();
		
			queue.enter(-2147481366);
				assertEquals(100, queue.getRear());
		assertEquals(-2147481366, queue.getElem(99));
		assertEquals(oldRear + 1, queue.getRear());
		assertEquals(oldFront, queue.getFront());
	}

}
