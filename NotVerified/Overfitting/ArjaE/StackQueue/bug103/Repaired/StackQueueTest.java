
import static org.junit.Assert.*;
import org.junit.Test;
public class StackQueueTest {	void repeat(Runnable r, int times) {
		for (int i = 0; i < times; i++) {
			r.run();
		}
	}

	@Test
	void test0() {
		StackQueue queueStackQueue = new StackQueue();
		StackQueue.Queue queue = queueStackQueue.new Queue();
		repeat(() -> {
			queue.enter(0);
		}, 54);
		repeat(() -> {
			queue.enter(1);
		}, 1);
		assertTrue(queue.isContain(1));

	}

//==============================================================================

	@Test
	void test1() {
		fail("The function queue_isContain() is not testable for this case");
	}

//==============================================================================

}
