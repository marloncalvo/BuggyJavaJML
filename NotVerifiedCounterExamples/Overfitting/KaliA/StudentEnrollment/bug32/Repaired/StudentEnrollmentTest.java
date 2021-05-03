package KaliA.StudentEnrollment.bug32.Repaired;

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
		se.setTuitionBalance(1);
		
		assertThrows(IllegalArgumentException.class, () -> {
			se.pay(-2147483647, true);
		});
	}
	
	@Test
	void case2() {
		se.setEnrollmentCredits(19);
		se.setTuitionBalance(1);
		
		assertThrows(IllegalArgumentException.class, () -> {
			se.pay(-2147483646, true);
		});
	}
	
	@Test
	void case3() {
		se.setEnrollmentCredits(4);
		se.setTuitionBalance(1902);
		
		assertThrows(IllegalArgumentException.class, () -> {
			se.pay(-2147481745, true);
		});
	}
	
	@Test
	void case4() {
		se.setEnrollmentCredits(13);
		se.setTuitionBalance(0);
		
		assertThrows(IllegalArgumentException.class, () -> {
			se.pay(-2147483648, true);
		});
	}
	
}
