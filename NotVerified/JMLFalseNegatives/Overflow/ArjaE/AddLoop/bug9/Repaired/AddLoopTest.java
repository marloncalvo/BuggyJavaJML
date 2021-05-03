
import static org.junit.Assert.*;
import org.junit.Test;
public class AddLoopTest {
	@Test
	void test() {
		int x = 2147483647;
		int y = -2147483647;
		assertEquals(AddLoop.AddLoop(x, y), 0);
	}

	@Test
	void test1() {
		int x = 2147483646;
		int y = 0;
		assertEquals(AddLoop.AddLoop(x, y), 2147483646);
	}
	
	@Test
	void test2() {
		int x = 2147483645;
		int y = 0;
		assertEquals(AddLoop.AddLoop(x, y), 2147483645);
	}
}
