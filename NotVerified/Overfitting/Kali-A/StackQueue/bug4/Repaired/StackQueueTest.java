
import static org.junit.Assert.*;

import org.junit.Test;

public class StackQueueTest {	
	@Test
	void case1() {
		StackQueue sq = new StackQueue();
		StackQueue.Stack stack = sq.new Stack();
		StackQueue.Queue queue = sq.new Queue();
		
		for (int i = 0; i < 100; i++) {
			stack.push(i);
		}
		
		assertTrue(stack.isFull());
	}
	
	@Test
	void case2() {
		StackQueue sq = new StackQueue();
		StackQueue.Stack stack = sq.new Stack();
		StackQueue.Queue queue = sq.new Queue();
		
		for (int i = 0; i < 100; i++) {
			stack.push(-2147481366);
		}
		
		assertThrows(IllegalArgumentException.class, () -> {
			stack.push(-2147481366);
		});
	}

}
