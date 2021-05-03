
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class StudentEnrollmentTest {
	StudentEnrollment se;
	
	@Before
	void setUp() throws Exception {
		se = new StudentEnrollment("", "");
	}

	@Test
	void case1() {
		se.setEnrollmentCredits(0);
		se.setTuitionBalance(1);
		
		assertThrows(IllegalArgumentException.class, () -> {
			se.lateEnrollment();
		});
	}
	
	@Test
	void case2() {
		se.setEnrollmentCredits(1);
		se.setTuitionBalance(2471);
		
		assertThrows(IllegalArgumentException.class, () -> {
			se.lateEnrollment();
		});
	}
	
	@Test
	void case3() {
		se.setEnrollmentCredits(1);
		se.setTuitionBalance(4240);
		
		assertThrows(IllegalArgumentException.class, () -> {
			se.lateEnrollment();
		});
	}
	
}
