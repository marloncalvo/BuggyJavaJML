package ArjaE.StudentEnrolment.bug30.Repaired;

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
		student.setLateRegistration(true);
		student.enroll();
		assertEquals(-2147483001, student.getTuition());
	}

	@Test
	void test0() {
		int enrollmentCredits = 1;
		int tuitionBalance = -2147397171;
		int passedCredits = 118;
		int semesterCredits = 2;
		int payment = 87400;
		int initialBalance = -2147397996;
		boolean lateRegistration = false;
		boolean debit = false;
		boolean option = true;
		
		StudentEnrollment student = new StudentEnrollment("", "");
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertEquals(-2147397596, student.getTuition());
	}
}
