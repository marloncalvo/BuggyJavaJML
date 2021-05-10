
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
	@Test
	public void test() {
		fail("Cannot find values for object o equals()");
	}

	@Test
	public void manual() {
		Time a = new Time(1,1,1);
		Time b = new Time(2,3,4);
		assertFalse(a.equals(b));
	}

}
