import static org.junit.Assert.*;

import org.junit.Test;

public class StackQueueTest {
    
    @Test
    public void test() {
        StackQueue stackQueue = new StackQueue();
        stackQueue.Queue queue = stackQueue.new Queue();
        for (int i = 0; i < 100; i++) {
            queue.enter(-2147481366);
        }

        assertThrows(IllegalArgumentException.class, () -> {
            queue.enter(-2147481366);
        });
    }


}
