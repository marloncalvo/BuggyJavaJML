import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {
    
    @Test
    public void test() {
        int [] array = new int[11811];
        array[0] = -1;

        int res = BinarySearch.Binary(array, -1);

        assertEquals(0, res);
    }

    /**
     * Counterexample array too large, same idea as before though.
     */
    @Test
    public void test0() {
        fail("The function Binary() is not testable for this case");
    }

}
