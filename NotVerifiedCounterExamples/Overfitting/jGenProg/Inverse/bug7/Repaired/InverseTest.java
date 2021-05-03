package jGenProg.Inverse.bug7.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InverseTest {

	@Test
    public static void case1() {
        int size = 7719;
        int [] arr1 = new int[size];
        int [] arr2 = new int[size];

        arr1[0] = 7719;
        arr2[size-1] = 7719; 
        arr1[1] = -1;

        assertFalse(Inverse.Inverse(arr1, arr2));
    }

	@Test
    public static void case2() {
        int size = 10803;
        int [] arr1 = new int[size];
        int [] arr2 = new int[size];

        arr1[0] = 11;
        arr2[size-1] = 11; 
        arr1[1] = -1;

        assertFalse(Inverse.Inverse(arr1, arr2));
    }
}
