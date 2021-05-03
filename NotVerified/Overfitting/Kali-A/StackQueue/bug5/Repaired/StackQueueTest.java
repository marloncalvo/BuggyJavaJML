
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
		int x = -2147481366;
		
		for (int i = 0; i < 100; i++) {
			stack.push(x);
		}
		
		assertThrows(IllegalArgumentException.class, () -> {
			stack.push(x);
		});
	}

}
