package KaliA.StudentEnrollment.bug2.Repaired;

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
