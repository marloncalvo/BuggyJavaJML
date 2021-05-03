package KaliA.StudentEnrollment.bug20.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentEnrollmentTest {

	StudentEnrollment se;
	
	@BeforeEach
	void setUp() throws Exception {
		se = new StudentEnrollment("", "");
	}

	@Test
	void case1() {
		se.setEnrollmentCredits(16);
		se.setTuitionBalance(-2147474793);
		
		assertFalse(se.validPayment(0));
	}
	
}
