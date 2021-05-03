
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
		se.setEnrollmentCredits(14);
		se.setTuitionBalance(-2147481211);
		
		assertThrows(IllegalArgumentException.class, () -> {
			se.setTuitionBalance(4241);
		});
	}

	@Test
	void case2() {
		se.setEnrollmentCredits(2);
		se.setTuitionBalance(-2147481408);
		
		assertThrows(IllegalArgumentException.class, () -> {
			se.setTuitionBalance(4241);
		});
	}
	
}
