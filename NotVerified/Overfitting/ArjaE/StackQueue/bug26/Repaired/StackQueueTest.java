
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
		StackQueue stackStackQueue = new StackQueue();
		StackQueue.Stack stack = stackStackQueue.new Stack();

		int oldTop = -1;
		int res = stackStackQueue.driverStack(stack, 0, -3);
		assertEquals(-3, stack.peek());
		assertEquals(oldTop + 1, stack.getTop());
		assertEquals(0, res);
	}

	/*
	
	*/
	@Test
	void test1() {
		StackQueue stackStackQueue = new StackQueue();
		StackQueue.Stack stack = stackStackQueue.new Stack();
		repeat(() -> {
			stack.push(1);
		}, 1);
		repeat(() -> {
			stack.push(0);
		}, 50);
		assertEquals(1, stack.getElem(0));
		assertEquals(50, stack.getTop());
	}

	/*
	
	*/
	@Test
	void test2() {
		StackQueue stackStackQueue = new StackQueue();
		StackQueue.Stack stack = stackStackQueue.new Stack();
		repeat(() -> {
			stack.push(0);
		}, 50);
		repeat(() -> {
			stack.push(14);
		}, 1);
		assertEquals(14, stack.getElem(50));
		assertEquals(50, stack.getTop());
	}

}
