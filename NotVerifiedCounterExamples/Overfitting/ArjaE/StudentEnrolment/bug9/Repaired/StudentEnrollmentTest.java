package ArjaE.StudentEnrolment.bug9.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentEnrollmentTest {

	// Test cases use invalid passedCredits, just using valid values instead.
	// invalid as in, passedCredits < 0, so I just make sure 0 <= passedCredits 
	// unless it already is 0 <= passedCredits.
	
	@Test
	void test() {
		int enrollmentCredits = 21;
		int passedCredits = 0;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setPassedCredits(passedCredits);
		assertThrows(IllegalArgumentException.class, () -> {
			student.setEnrollmentCredits(enrollmentCredits);			
		});
	}

	@Test
	void test0() {
		int enrollmentCredits = 21;
		int passedCredits = 1;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setPassedCredits(passedCredits);
		assertThrows(IllegalArgumentException.class, () -> {
			student.setEnrollmentCredits(enrollmentCredits);			
		});
	}

}
