package Overflow.jGenProg.AddLoop.bug2.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddLoopTest {

	@Test
	void test() {
		int x = -1;
		int y = 1;
		assertEquals(AddLoop.AddLoop(x, y), x+y);
	}
	
	@Test
	void test1() {
		int x = 2147483646;
		int y = 1;
		assertEquals(AddLoop.AddLoop(x, y), x+y);
	}

}
