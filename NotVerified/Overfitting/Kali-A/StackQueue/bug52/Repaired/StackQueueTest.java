
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StackQueueTest {
	StackQueue.Stack stack;
	StackQueue.Queue queue;
	
	@Before
	void setUp() throws Exception {
		StackQueue sq = new StackQueue();
		stack = sq.new Stack();
		queue = sq.new Queue();
	}

	@Test
	void case1() {
		int data = -2147481366;
		
		for (int i = 0; i < 100; i++) {
			queue.enter(data);
		}
		
		assertThrows(IllegalArgumentException.class, () -> {
			queue.enter(data);
		});
	}
	
	@Test
	void case2() {
		int data = -1;
		
		for (int i = 0; i < 100; i++) {
			queue.enter(data);
		}
		
		assertTrue(queue.isFull());
	}

}
