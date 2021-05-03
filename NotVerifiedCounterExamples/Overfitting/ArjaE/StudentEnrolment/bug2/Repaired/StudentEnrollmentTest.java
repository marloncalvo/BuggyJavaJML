package ArjaE.StudentEnrolment.bug2.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentEnrollmentTest {

	@Test
	void test() {
		int enrollmentCredits = 14;
		int tuitionBalance = -2147481760;
		int _tuitionBalance = 4240;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setTuitionBalance(tuitionBalance);
		student.setEnrollmentCredits(enrollmentCredits);
		assertDoesNotThrow(() -> {
			student.setTuitionBalance(_tuitionBalance);			
		});
		assertEquals(_tuitionBalance, student.getTuition());
	}

}
