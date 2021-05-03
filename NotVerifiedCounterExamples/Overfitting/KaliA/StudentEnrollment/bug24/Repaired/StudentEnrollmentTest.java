package KaliA.StudentEnrollment.bug24.Repaired;

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
