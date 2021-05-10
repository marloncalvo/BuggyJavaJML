import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortTest {

    /**
     * Large array, needs 6GB of heap space. OpenJML false negative.
     * Issue is overflow, but it requires large array size, which cannot
     * be replicated due to memory requirement.
     */
    @Test
    public void test() {
        int [] array = new int[1073741948];
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i;
        }

        array = new BubbleSort().bubbleSort(array);

        for (int i = 1; i < array.length; i++) {
            assertTrue(array[i-1] <= array[i]);
        }
    }

    /**
     * OpenJML false negative.
     */
    @Test
    public void test0() {
        int [] array = new int[13868];
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i;
        }

        array = new BubbleSort().bubbleSort(array);

        for (int i = 1; i < array.length; i++) {
            assertTrue(array[i-1] <= array[i]);
        }
    }

}