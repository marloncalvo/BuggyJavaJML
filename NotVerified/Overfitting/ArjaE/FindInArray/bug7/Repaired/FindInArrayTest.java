import static org.junit.Assert.*;

import org.junit.Test;

public class FindInArrayTest {
    
    /**
     * OpenJML false negative.
     */
    @Test
    public void test() {
        int [] array = new int[1];
        int key = -2147474226;
        array[0] = key;

        FindInArray fia = new FindInArray(array, key);
        int res = fia.findLast();

        assertEquals(0, res);
    }

}
