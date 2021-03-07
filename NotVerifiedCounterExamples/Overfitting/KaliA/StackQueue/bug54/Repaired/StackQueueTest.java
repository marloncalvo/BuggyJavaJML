package KaliA.StackQueue.bug54.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import KaliA.StackQueue.bug54.Repaired.StackQueue.Queue;
import KaliA.StackQueue.bug54.Repaired.StackQueue.Stack;

class StackQueueTest {

	Stack stack;
	Queue queue;
	
	@BeforeEach
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
