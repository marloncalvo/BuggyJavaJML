
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
	@Test
	void test() {
		fail("The function equals() is not testable for this case");
	}

	@Test
	void test0() {
		Time a = new Time(9, 4, 24);
		Time b = new Time(10, 5, 25);
		assertNotEquals(a, b);
	}

	@Test
	void test1() {
		Time time = new Time(6, 58, 27);
		Time __timeOld = new Time(6, 58, 27);
		Time start = new Time(14, 46, 4);
		Time __startOld = new Time(14, 46, 4);
		Time end = new Time(20, 43, 39);
		Time __endOld = new Time(20, 43, 39);
		int sel = 0;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(0, res.getHour());
		assertEquals(0, res.getMinute());
		assertEquals(0, res.getSecond());
		assertEquals(__startOld.getHour(), start.getHour());
		assertEquals(__startOld.getMinute(), start.getMinute());
		assertEquals(__startOld.getSecond(), start.getSecond());
		assertEquals(__endOld.getHour(), end.getHour());
		assertEquals(__endOld.getMinute(), end.getMinute());
		assertEquals(__endOld.getSecond(), end.getSecond());
	}

    @Test
    void test2() {
        fail("The function trustedDifference() is not testable for this case");
    }

    @Test
    void test3() {
        fail("The function trustedDifference() is not testable for this case");
    }
    
    @Test
    void test4() {
        fail("The function trustedDifference() is not testable for this case");
    }
    
}
