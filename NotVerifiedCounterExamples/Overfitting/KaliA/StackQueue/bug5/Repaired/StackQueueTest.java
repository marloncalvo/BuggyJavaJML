package KaliA.StackQueue.bug5.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import KaliA.StackQueue.bug5.Repaired.StackQueue.Queue;
import KaliA.StackQueue.bug5.Repaired.StackQueue.Stack;

class StackQueueTest {

	Stack stack;
	Queue queue;
	
	@BeforeEach
	void setUp() throws Exception {
		StackQueue sq = new StackQueue();
		stack = sq.new Stack();
		queue = sq.new Queue();
	}

	@Test
	void case1() {
		int x = -2147481366;
		
		for (int i = 0; i < 100; i++) {
			stack.push(x);
		}
		
		assertThrows(IllegalArgumentException.class, () -> {
			stack.push(x);
		});
	}

}
