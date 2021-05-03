package ArjaE.StudentEnrolment.bug6.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentEnrollmentTest {

	@Test
	void test() {
		int enrollmentCredits = 16;
		int tuitionBalance = -2147474793;
		int passedCredits = -1;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tuitionBalance);
		assertThrows(IllegalArgumentException.class, () -> {
			student.setPassedCredits(passedCredits);
		});
	}

	@Test
	void test0() {
		int enrollmentCredits = 6;
		int tuitionBalance = -2147482325;
		int passedCredits = -1;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tuitionBalance);
		assertThrows(IllegalArgumentException.class, () -> {
			student.setPassedCredits(passedCredits);
		});
	}
}
