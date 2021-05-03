
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
			stack.push(-12321);
		}, 88);
		repeat(() -> {
			stack.push(0);
		}, 1);
		repeat(() -> {
			stack.push(-2147483647);
		}, 1);
		repeat(() -> {
			stack.push(2147481739);
		}, 1);
		int oldTop = 90;
		int res = stackStackQueue.driverStack(stack, 1, -12321);
		assertEquals(2147481739, res);
		assertEquals(oldTop - 1, stack.getTop());
	}

//==============================================================================

	@Test
	void test1() {
		StackQueue stackStackQueue = new StackQueue();
		StackQueue.Stack stack = stackStackQueue.new Stack();
		repeat(() -> {
			stack.push(-12321);
		}, 47);
		repeat(() -> {
			stack.push(-2);
		}, 1);
		repeat(() -> {
			stack.push(-2147483647);
		}, 1);
		repeat(() -> {
			stack.push(2147481739);
		}, 1);
		int oldTop = 49;
		int res = stackStackQueue.driverStack(stack, 1, -12321);
		assertEquals(2147481739, res);
		assertEquals(oldTop - 1, stack.getTop());
	}

//==============================================================================

	@Test
	void test2() {
		StackQueue stackStackQueue = new StackQueue();
		StackQueue.Stack stack = stackStackQueue.new Stack();
		repeat(() -> {
			stack.push(-12321);
		}, 43);
		repeat(() -> {
			stack.push(-1);
		}, 1);
		repeat(() -> {
			stack.push(-2147483648);
		}, 1);
		repeat(() -> {
			stack.push(2147481739);
		}, 1);
		int oldTop = 45;
		int res = stackStackQueue.driverStack(stack, 1, -12321);
		assertEquals(2147481739, res);
		assertEquals(oldTop - 1, stack.getTop());
	}

//==============================================================================

	@Test
	void test3() {
		StackQueue stackStackQueue = new StackQueue();
		StackQueue.Stack stack = stackStackQueue.new Stack();
		repeat(() -> {
			stack.push(-12321);
		}, 43);
		repeat(() -> {
			stack.push(-429495707);
		}, 1);
		repeat(() -> {
			stack.push(1073745662);
		}, 1);
		repeat(() -> {
			stack.push(-1073737987);
		}, 1);
		int oldTop = 45;
		int res = stackStackQueue.driverStack(stack, 1, -12321);
		assertEquals(-1073737987, res);
		assertEquals(oldTop - 1, stack.getTop());
	}

//==============================================================================

}
