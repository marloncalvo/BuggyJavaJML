
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

    public static void case1() {
        StackQueue sq = new StackQueue();
        StackQueue.Queue q = sq.new Queue();
        for (int i = 0; i < 99; i++) {
            q.enter(-1);
        }

        assertFalse(q.isFull());
    }

    public static void case2() {
        StackQueue sq = new StackQueue();
        StackQueue.Queue q = sq.new Queue();
        for (int i = 0; i < 99; i++) {
            q.enter(-1);
        }

        // assert exception
        assertThrows(IllegalArgumentException.class, () -> {
        	q.enter(-1);
        });
    }

}
