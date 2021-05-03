
import static org.junit.Assert.*;
import org.junit.Test;
public class AddLoopTest {
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
