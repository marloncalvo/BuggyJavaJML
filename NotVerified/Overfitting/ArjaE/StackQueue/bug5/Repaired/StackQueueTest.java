
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
		repeat(() -> {
			stack.push(0);
		}, 100);
		StackQueue oldStackStackQueue = new StackQueue();
		StackQueue.Stack oldStack = oldStackStackQueue.new Stack();
		repeat(() -> {
			oldStack.push(0);
		}, 100);
		assertThrows(IllegalArgumentException.class, () -> {
			stack.push(2147475283);
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
		assertThrows(IllegalArgumentException.class, () -> {
			stack.push(-2147475283);
		});

	}

}
