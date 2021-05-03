
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
		}, 57);
		repeat(() -> {
			stack.push(11);
		}, 1);
		assertDoesNotThrow(() -> {
			repeat(() -> {
				assertEquals(11, stack.peek());
			}, 1);
		});
		assertEquals(57, stack.getTop());
	}

//==============================================================================

	@Test
	void test1() {
		StackQueue stackStackQueue = new StackQueue();
		StackQueue.Stack stack = stackStackQueue.new Stack();
		repeat(() -> {
			stack.push(11);
		}, 1);
		assertDoesNotThrow(() -> {
			repeat(() -> {
				assertEquals(11, stack.peek());
			}, 1);
		});
		assertEquals(0, stack.getTop());
	}

//==============================================================================

	@Test
	void test2() {
		StackQueue stackStackQueue = new StackQueue();
		StackQueue.Stack stack = stackStackQueue.new Stack();
		repeat(() -> {
			stack.push(0);
		}, 62);
		repeat(() -> {
			stack.push(11);
		}, 1);
		repeat(() -> {
			stack.push(14);
		}, 1);
		assertDoesNotThrow(() -> {
			repeat(() -> {
				assertEquals(14, stack.peek());
			}, 2);
		});
		assertEquals(63, stack.getTop());
	}

//==============================================================================

}
