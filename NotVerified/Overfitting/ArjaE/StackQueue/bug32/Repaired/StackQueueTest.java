import static org.junit.Assert.*;

import org.junit.Test;

public class StackQueueTest {
    
    @Test
    public void test() {
        StackQueue stackQueue = new StackQueue();
        StackQueue.Queue queue = stackQueue.new Queue();

        queue.enter(30);
        for (int i = 0; i < 99; i++) {
            queue.enter(i);
        }

        int oldRear = queue.getRear();
        int oldValue = queue.getElem(queue.getFront());

        int res = queue.delete();

        assertEquals(oldRear-1, queue.getRear());
        assertEquals(oldValue, res);

        for (int i = 0; i < queue.getRear(); i++) {
            assertEquals(i, queue.getElem(i));
        }
    }

    /**
     * OpenJML false negative.
     */
    @Test
    public void test0() {
        StackQueue stackQueue = new StackQueue();
        StackQueue.Queue queue = stackQueue.new Queue();

        queue.enter(23);
        for (int i = 0; i < 51; i++) {
            queue.enter(i);
        }

        int oldRear = queue.getRear();
        int oldValue = queue.getElem(queue.getFront());

        int res = queue.delete();

        assertEquals(oldRear-1, queue.getRear());
        assertEquals(oldValue, res);

        for (int i = 0; i < queue.getRear(); i++) {
            assertEquals(i, queue.getElem(i));
        }
    }

}
