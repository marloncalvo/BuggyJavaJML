
import static org.junit.Assert.*;
import org.junit.Test;
public class PerimeterTest {
	@Test
	void test() {
		short x = 1;
		Perimeter perimeter = new Perimeter();
		assertEquals(4*x, perimeter.Perimeter(x));
	}

}
