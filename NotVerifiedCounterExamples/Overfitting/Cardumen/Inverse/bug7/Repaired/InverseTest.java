package Cardumen.Inverse.bug7.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class InverseTest {

	@Test
	public void case1() {
        int size = 1000000; // supposed to be 2147481851
        int [] arr = new int[size];
        arr[0] = 8855;
        arr[8855] = -1;

        int [] arr2 = new int[size];
        arr2[size-1] = 8855;
        arr2[size - 8855 - 1] = -1;

        // out of bounds exception

        assertTrue(Inverse.Inverse(arr, arr2));
    }

	@Test
	@Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void case2() {
        int size = 8366;
        int [] arr = new int[size];
        arr[0] = 8276;
        arr[8276] = 5484;

        int [] arr2 = new int[size];
        arr2[size-1] = 8276;
        arr2[size - 8276 - 1] = 5484;

        // hangs forever because of zeroes in arr/arr2
        // test case is supposed to show that @decreases does not hold
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
            assertTrue(Inverse.Inverse(arr, arr2));
        });
    }

	@Test
	public void case3() {
        int size = 7627;
        int [] arr = new int[size];
        arr[0] = 281;
        arr[1] = 1;
        arr[281] = 6564;
        arr[6564] = size + 3;

        int [] arr2 = new int[size];
        arr2[size-1] = 281;
        arr2[size - 1 - 1] = -1;
        arr2[size - 281 - 1] = 6564;
        arr2[size - 6564 - 1] = size + 3; // we set size to end while loop

        assertFalse(Inverse.Inverse(arr, arr2));
    }

}
