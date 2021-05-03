package KaliA.StudentEnrollment.bug10.Repaired;

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
		se.setEnrollmentCredits(20);
		se.setTuitionBalance(-2147474793);
		
		assertThrows(IllegalArgumentException.class, () -> {
			se.setEnrollmentCredits(21);
		});
	}

}
