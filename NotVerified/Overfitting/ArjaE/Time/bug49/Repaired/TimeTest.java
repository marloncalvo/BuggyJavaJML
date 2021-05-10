
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
    public void test2() {
        fail("The function trustedDifference() is not testable for this case");
    }

    @Test
	public void manual() {
		Time a = new Time(1,1,1);
		Time b = new Time(2,3,4);
		assertFalse(a.equals(b));
	}

	@Test
    public void manual0() {
        Time a = new Time(1,20,5);
        Time b = new Time(0,20,5);
        Time res = b.difference(b, a);
        assertEqual(new Time(1,0,0), res);
    }

    @Test
    public void manual1() {
        Time a = new Time(13,6,37);
        Time b = new Time(1,1,1);
		Time c = new Time(13,4,50);
        Time res = b.difference(c,a);
        assertEqual(new Time(0,1,47), res);
    }

	public void assertEqual(Time a, Time b) {
        assertEquals(a.getHour(), b.getHour());
        assertEquals(a.getMinute(), b.getMinute());
        assertEquals(a.getSecond(), b.getSecond());
    }
}
