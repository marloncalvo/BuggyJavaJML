
import static org.junit.Assert.*;
import org.junit.Test;
import ArjaE.Smallest.bug1.Repaired.Smallest;

public class SmallestTest {
	@Test
	void test() {
		int[] array = {};
		assertEquals(-1, Smallest.Smallest(array));
	}

}
