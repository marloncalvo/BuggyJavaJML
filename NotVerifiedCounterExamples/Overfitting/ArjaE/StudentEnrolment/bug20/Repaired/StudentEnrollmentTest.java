package ArjaE.StudentEnrolment.bug20.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentEnrollmentTest {

	@Test
	void test() {
		int enrollmentCredits = 16;
		int tuitionBalance = -2147474793;
		int payment = -1;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tuitionBalance);
		assertFalse(student.validPayment(payment));
	}

}
