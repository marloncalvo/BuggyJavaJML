
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import KaliA.StackQueue.bug4.Repaired.StackQueue.Queue;
import KaliA.StackQueue.bug4.Repaired.StackQueue.Stack;

public class StackQueueTest {	
	@Test
	void case1() {
		StackQueue sq = new StackQueue();
		Stack stack = sq.new Stack();
		Queue queue = sq.new Queue();
		
		for (int i = 0; i < 100; i++) {
			stack.push(i);
		}
		
		assertTrue(stack.isFull());
	}
	
	@Test
	void case2() {
		StackQueue sq = new StackQueue();
		Stack stack = sq.new Stack();
		Queue queue = sq.new Queue();
		
		for (int i = 0; i < 100; i++) {
			stack.push(-2147481366);
		}
		
		assertThrows(IllegalArgumentException.class, () -> {
			stack.push(-2147481366);
		});
	}

}
