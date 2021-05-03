package ArjaE.Perimeter.bug11.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PerimeterTest {

	@Test
	void test() {
		short x = 1;
		Perimeter perimeter = new Perimeter();
		assertEquals(4*x, perimeter.Perimeter(x));
	}

}
