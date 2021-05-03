package Modular.ArjaE.StudentEnrollment.bug32.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentEnrollmentTest {

	@Test
	void test() {
		StudentEnrollment s = new StudentEnrollment("", "");
		s.setEnrollmentCredits(14);
		s.setTuitionBalance(1);
		int payment = -2147483647;
		fail("not implemented yet");
	}

}
