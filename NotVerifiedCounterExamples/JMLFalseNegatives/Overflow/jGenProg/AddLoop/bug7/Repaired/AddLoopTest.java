package Overflow.jGenProg.AddLoop.bug7.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddLoopTest {

	@Test
	void test() {
		int x = 0;
		int y = 0;
		assertEquals(AddLoop.AddLoop(x,y), x+y);
	}

	@Test
	void test1() {
		int x = 2147483647;
		int y = 0;
		assertEquals(AddLoop.AddLoop(x,y), x+y);
	}
}
