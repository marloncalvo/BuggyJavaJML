package KaliA.StudentEnrollment.bug21.Repaired;

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
		se.setTuitionBalance(4017);
		
		assertThrows(IllegalArgumentException.class, () -> {
			se.regularEnrollment();
		});
	}
	
	@Test
	void case2() {
		se.setEnrollmentCredits(20);
		se.setTuitionBalance(241);
		
		assertThrows(IllegalArgumentException.class, () -> {
			se.regularEnrollment();
		});
	}
	
	@Test
	void case3() {
		se.setEnrollmentCredits(20);
		se.setTuitionBalance(1);
		
		assertThrows(IllegalArgumentException.class, () -> {
			se.regularEnrollment();
		});
	}
	
}
