
import static org.junit.Assert.*;
import org.junit.Test;
public class StackQueueTest {
	void repeat(Runnable r, int times) {
		for (int i = 0; i < times; i++) {
			r.run();
		}
	}

	/*
	 * inputs are out of int range
	 */
	@Test
	public void test0() {
		fail("The function driverqstack() is not testable for this case");
	}

	/*
	 * inputs are out of int range
	 */
	@Test
	public void test1() {
		fail("The function driverqstack() is not testable for this case");
	}

	@Test
	public void manual() {
		StackQueue stackQueue = new StackQueue();
		StackQueue.Queue queue = stackQueue.new Queue();
		StackQueue.Stack stack = stackQueue.new Stack();
		queue.enter(429496729);
		queue.enter(1);
		queue.enter(1);
		stack.push(1);
		stack.push(1);
		stack.push(-21474859);
		int res = stackQueue.driverQStack(stack, queue, 3);
		assertEquals(stack.peek()/queue.peek(), res);
	}

	@Test
	public void manual0() {
		StackQueue stackQueue = new StackQueue();
		StackQueue.Queue queue = stackQueue.new Queue();
		StackQueue.Stack stack = stackQueue.new Stack();
		queue.enter(429496729);
		stack.push(-21474859);
		int res = stackQueue.driverQStack(stack, queue, 3);
		assertEquals(stack.peek()/queue.peek(), res);
	}

}
