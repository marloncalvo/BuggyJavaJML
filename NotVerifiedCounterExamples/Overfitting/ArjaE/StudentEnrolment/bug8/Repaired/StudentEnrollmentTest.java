package ArjaE.StudentEnrolment.bug8.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentEnrollmentTest {

	@Test
	void test() {
		int enrollmentCredits = 21;
		StudentEnrollment enrollment = new StudentEnrollment("", "");
		assertThrows(IllegalArgumentException.class, () -> {
			enrollment.setEnrollmentCredits(enrollmentCredits);
		});
	}

	@Test
	void test0() {
		int enrollmentCredits = 21;
		StudentEnrollment enrollment = new StudentEnrollment("", "");
		assertThrows(IllegalArgumentException.class, () -> {
			enrollment.setEnrollmentCredits(enrollmentCredits);
		});
	}
	
}
