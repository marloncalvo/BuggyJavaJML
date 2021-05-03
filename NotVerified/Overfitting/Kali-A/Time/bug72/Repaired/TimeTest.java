
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {	
	@Test
	void case1() {
		Time time = new Time(22, 37, 35);
		assertFalse(time.equals(null));
	}
	
	@Test
    void case2() {
        Time time = new Time(22, 37, 35);
        assertFalse(time.equals(""));
    }

	@Test
    void case3() {
        Time time = new Time(14, 1, 31);
        Time start = new Time(15, 28, 45);
        Time end = new Time(15, 28, 45);
        
        Time res = time.timeOptions(start, end, 3);
        

		assertEquals(res.getHour(), 0);
		assertEquals(res.getMinute(), 0);
		assertEquals(res.getSecond(), 0);
    }
		
}
