
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
	@Test
	public void test() {
		fail("The function equals() is not testable for this case");
	}

	@Test
	public void test0() {
		fail("The function equals() is not testable for this case");
	}

    @Test
    public void test1() {
        fail("The function trustedDifference() is not testable for this case");
    }

	@Test
	public void manual() {
		Time a = new Time(1,1,1);
		Time b = new Time(2,3,4);
		assertFalse(a.equals(b));
	}

	@Test
    public void manual1() {
		Time a = new Time(15,16,5);
		Time b = new Time(7,51,7);
        Time res = b.difference(b,a);
        assertEqual(new Time(7,24,58), res);
    }

	public void assertEqual(Time a, Time b) {
        assertEquals(a.getHour(), b.getHour());
        assertEquals(a.getMinute(), b.getMinute());
        assertEquals(a.getSecond(), b.getSecond());
    }
}
