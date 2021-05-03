
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

		StackQueue oldStackStackQueue = new StackQueue();
		StackQueue.Stack oldStack = oldStackStackQueue.new Stack();

		assertThrows(IllegalArgumentException.class, () -> {
			stack.pop();
		});
	}

	/*
	
	*/
	@Test
	void test1() {
		StackQueue stackStackQueue = new StackQueue();
		StackQueue.Stack stack = stackStackQueue.new Stack();
		repeat(() -> {
			stack.push(0);
		}, 100);
		StackQueue oldStackStackQueue = new StackQueue();
		StackQueue.Stack oldStack = oldStackStackQueue.new Stack();
		repeat(() -> {
			oldStack.push(0);
		}, 100);
		int[] res = { -1 };
		
			res[0] = stack.pop();
				assertEquals(oldStack.getTop() - 1, stack.getTop());
		assertEquals(oldStack.getElem(oldStack.getTop()), res[0]);
		for (int i = 0; i < 100; i++) {
			assertEquals(oldStack.getElem(i), stack.getElem(i));
		}
	}

	/*
	
	*/
	@Test
	void test2() {
		StackQueue stackStackQueue = new StackQueue();
		StackQueue.Stack stack = stackStackQueue.new Stack();

		StackQueue oldStackStackQueue = new StackQueue();
		StackQueue.Stack oldStack = oldStackStackQueue.new Stack();

		assertThrows(IllegalArgumentException.class, () -> {
			stack.pop();
		});
	}

}
