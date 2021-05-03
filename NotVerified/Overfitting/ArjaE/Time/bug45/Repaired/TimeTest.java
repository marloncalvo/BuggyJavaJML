
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
	@Test
	void test() {
		Time a = new Time(13, 25, 35);
		Time b = new Time(23, 25, 35);
		assertNotEquals(a, b);
	}


	@Test
	void test1() {
		Time a = new Time(10, 23, 12);
		Time b = new Time(23, 23, 12);
		assertNotEquals(a, b);
		fail("False negative");
	}
	
	@Test
	void test2() {
		Time a = new Time(17, 23, 17);
		Time b = new Time(23, 23, 17);
		assertNotEquals(a, b);
		fail("False negative");
	}

}
