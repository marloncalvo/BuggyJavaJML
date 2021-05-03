
import static org.junit.Assert.*;
import org.junit.Test;
public class StackQueueTest {
	void repeat(Runnable r, int times) {
		for (int i = 0; i < times; i++) {
			r.run();
		}
	}

	@Test
	void test0() {
		StackQueue stackStackQueue = new StackQueue();
		StackQueue.Stack stack = stackStackQueue.new Stack();
		repeat(() -> {
			stack.push(0);
		}, 99);
		repeat(() -> {
			stack.push(14);
		}, 1);
		
			repeat(() -> {
				assertEquals(14, stack.peek());
			}, 1);
				assertEquals(99, stack.getTop());
	}

//==============================================================================

	@Test
	void test1() {
		StackQueue stackStackQueue = new StackQueue();
		StackQueue.Stack stack = stackStackQueue.new Stack();
		repeat(() -> {
			stack.push(0);
		}, 98);
		repeat(() -> {
			stack.push(11);
		}, 1);
		repeat(() -> {
			stack.push(14);
		}, 1);
		
			repeat(() -> {
				assertEquals(14, stack.peek());
			}, 2);
				assertEquals(99, stack.getTop());
	}

//==============================================================================

	@Test
	void test2() {
		StackQueue stackStackQueue = new StackQueue();
		StackQueue.Stack stack = stackStackQueue.new Stack();
		repeat(() -> {
			stack.push(11);
		}, 100);
		
			repeat(() -> {
				assertEquals(11, stack.peek());
			}, 101);
				assertEquals(99, stack.getTop());
	}

//==============================================================================

}
