
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
	@Test
	void test() {
		Time a = new Time(9, 12, 47);
		Time b = new Time(8, 13, 46);
		assertNotEquals(a, b);
	}

	@Test
	void test0() {
		fail("The function equals() is not testable for this case");
	}

	@Test
	void test1() {
		Time time = new Time(1, 59, 13);
		Time __timeOld = new Time(1, 59, 13);
		Time start = new Time(4, 38, 26);
		Time __startOld = new Time(4, 38, 26);
		Time end = new Time(4, 38, 38);
		Time __endOld = new Time(4, 38, 38);
		int sel = 3;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(__timeOld.getHour(), res.getHour());
		assertEquals(__timeOld.getMinute(), res.getMinute());
		assertEquals(__timeOld.getSecond(), res.getSecond());
	}

	@Test
	void test2() {
		Time time = new Time(1, 1, 29);
		Time __timeOld = new Time(1, 1, 29);
		Time start = new Time(0, 54, 3);
		Time __startOld = new Time(0, 54, 3);
		Time end = new Time(0, 54, 3);
		Time __endOld = new Time(0, 54, 3);
		int sel = 3;
		Time res = time.timeOptions(start, end, sel);
		assertEquals(0, res.getHour());
		assertEquals(0, res.getMinute());
		assertEquals(0, res.getSecond());
		assertEquals(0, start.getHour());
		assertEquals(0, start.getMinute());
		assertEquals(0, start.getSecond());
		assertEquals(__endOld.getHour(), end.getHour());
		assertEquals(__endOld.getMinute(), end.getMinute());
		assertEquals(__endOld.getSecond(), end.getSecond());
	}

}
