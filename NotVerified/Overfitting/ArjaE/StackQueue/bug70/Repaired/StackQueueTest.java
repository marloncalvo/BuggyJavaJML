
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
		}, 46);
		repeat(() -> {
			stack.push(2147479721);
		}, 1);
		repeat(() -> {
			stack.push(-42);
		}, 1);
		int oldTop = stack.getTop();
		int oldSize = stack.size();
		int res = stackStackQueue.driverStack(stack, 7, -12321);
		assertEquals(-42 % 2147479721, res);
		assertEquals(oldSize - 1, stack.size());
	}

}
