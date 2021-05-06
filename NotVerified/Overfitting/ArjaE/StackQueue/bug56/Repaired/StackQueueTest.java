import static org.junit.Assert.*;

import org.junit.Test;

public class StackQueueTest {
    
    @Test
    public void test() {
        StackQueue stackQueue = new StackQueue();
        StackQueue.Queue queue = stackQueue.new Queue();
        int front = -2147482412;
        int len = 100;
        for (int i = 0; i < len; i++) {
            queue.enter(front + i);
        }

        int oldRear = queue.getRear();
        int res = queue.delete();
        assertEquals(oldRear-1, queue.getRear());
        assertEquals(front, res);

        for (int i = 0; i < len-1; i++) {
            assertEquals(front + (i+1), queue.getElem(i));
        }
    }

    @Test
    public void test0() {
        StackQueue stackQueue = new StackQueue();
        StackQueue.Queue queue = stackQueue.new Queue();
        int front = 29;
        int len = 99;
        for (int i = 0; i < len; i++) {
            queue.enter(front + i);
        }

        int oldRear = queue.getRear();
        int res = queue.delete();
        assertEquals(oldRear-1, queue.getRear());
        assertEquals(front, res);

        for (int i = 0; i < len-1; i++) {
            assertEquals(front + (i+1), queue.getElem(i));
        }
    }

    /**
     * Value of queue front was not defined.
     */
    @Test
    public void test1() {
        StackQueue stackQueue = new StackQueue();
        StackQueue.Queue queue = stackQueue.new Queue();
        queue.enter(10);
        assertEquals(10, queue.getFront());
    }


}
