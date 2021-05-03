package ArjaE.StudentEnrolment.bug31.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentEnrollmentTest {

	@Test
	void test() {
		int enrollmentCredits = 1;
		int tuitionBalance = -2147483213;
		int passedCredits = -1;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tuitionBalance);
		student.setLateRegistration(false);
		student.enroll();
		assertEquals(-2147483013, student.getTuition());
	}

	@Test
	void test0() {
		int enrollmentCredits = 1;
		int tuitionBalance = -2147220548;
		int passedCredits = 118;
		int semesterCredits = 2;
		int payment = 263100;
		int initialBalance = -2147220548;
		boolean lateRegistration = true;
		boolean debit = true;
		boolean option = true;
		
		StudentEnrollment student = new StudentEnrollment("", "");
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertEquals(-2147220124, student.getTuition());
	}

}
