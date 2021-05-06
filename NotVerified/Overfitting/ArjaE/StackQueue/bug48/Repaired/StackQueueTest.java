import static org.junit.Assert.*;

import org.junit.Test;

public class StackQueueTest {
    
    @Test
    public void test() {
        StackQueue stackQueue = new StackQueue();
        StackQueue.Queue queue = stackQueue.new Queue();
        for (int i = 0; i < 66; i++) {
            queue.enter(i+1);
        }

        int oldRear = queue.getRear();
        int res = queue.search(0);
        assertEquals(-1, res);
        assertEquals(oldRear, queue.getRear());
    }

    @Test
    public void test0() {
        StackQueue stackQueue = new StackQueue();
        StackQueue.Queue queue = stackQueue.new Queue();
        for (int i = 0; i < 100; i++) {
            queue.enter(i+1);
        }

        int oldRear = queue.getRear();
        int res = queue.search(102);
        assertEquals(-1, res);
        assertEquals(oldRear, queue.getRear());
    }

}
