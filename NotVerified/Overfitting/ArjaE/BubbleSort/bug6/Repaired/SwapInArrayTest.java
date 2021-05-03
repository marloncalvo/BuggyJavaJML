import static org.junit.Assert.*;

import org.junit.Test;

public class SwapInArrayTest {

    @Test
    public void test() {
        int [] array = new int[2439];
        int x = 2438;
        int y = 2437;

        array[x] = 12;
        array[y] = 10;

        SwapInArray sia = new SwapInArray();
        sia.swap(x, y, array);

        assertEquals(12, array[y]);
        assertEquals(10, array[x]);
    }

}