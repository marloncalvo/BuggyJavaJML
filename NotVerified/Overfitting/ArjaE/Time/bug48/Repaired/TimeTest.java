
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
	@Test
	void test() {
		fail("The function equals() is not testable for this case");
	}

	@Test
	void test0() {
		fail("The function equals() is not testable for this case");
	}

	@Test
	void test1() {
		Time time = new Time(1, 46, 52);
		Time __timeOld = new Time(1, 46, 52);
		Time start = new Time(22, 28, 15);
		Time __startOld = new Time(22, 28, 15);
		Time end = new Time(22, 28, 15);
		Time __endOld = new Time(22, 28, 15);
		int sel = 4;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(0, res.getHour());
		assertEquals(0, res.getMinute());
		assertEquals(0, res.getSecond());
		assertEquals(__startOld.getHour(), start.getHour());
		assertEquals(__startOld.getMinute(), start.getMinute());
		assertEquals(__startOld.getSecond(), start.getSecond());
	}
	
    @Test
    void test2() {
        fail("The function trustedDifference() is not testable for this case");
    }
    
}
