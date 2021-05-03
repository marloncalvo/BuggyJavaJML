
import static org.junit.Assert.*;
import org.junit.Test;
public class AddLoopTest {
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
