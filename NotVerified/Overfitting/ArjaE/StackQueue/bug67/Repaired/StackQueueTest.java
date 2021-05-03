
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

		assertThrows(IllegalArgumentException.class, () -> {
			stack.peek();
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
		
			repeat(() -> {
				assertEquals(0, stack.peek());
			}, 1);
				assertEquals(99, stack.getTop());
	}

}
