package jGenProg.Smallest.bug1.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmallestTest {

	@Test
	void test() {
        int [] arr = new int[0];
        assertEquals(Smallest.Smallest(arr), -1);
	}

}
