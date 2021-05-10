
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
    public void test3() {
        fail("The function trustedDifference() is not testable for this case");
    }
    
    @Test
    public void test4() {
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
        Time a = new Time(13,35,17);
        Time b = new Time(17,2,12);
        Time res = b.difference(b, a);
        assertEqual(new Time(3,26,35), res);
    }

    @Test
    public void manual1() {
        Time a = new Time(5,57,40);
        Time b = new Time(19,38,1);
        Time res = b.difference(b, a);
        assertEqual(new Time(13,40,21), res);
    }

    @Test
    public void manual2() {
        Time a = new Time(9,21,51);
        Time b = new Time(9,36,2);
        Time res = b.difference(b, a);
        assertEqual(new Time(0,14,11), res);
    }

    public void assertEqual(Time a, Time b) {
        assertEquals(a.getHour(), b.getHour());
        assertEquals(a.getMinute(), b.getMinute());
        assertEquals(a.getSecond(), b.getSecond());
    }
}
