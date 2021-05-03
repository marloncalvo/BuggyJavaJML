package ArjaE.StudentEnrolment.bug5.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentEnrollmentTest {

	@Test
	void test() {
		int enrollmentCredits = 20;
		int tuitionBalance = 2;
		int passedCredits = 121;
		int semesterCredits = 19;
		int payment = -2147483600;
		int initialBalance = 1;
		boolean lateRegistration = true;
		boolean debit = false;
		boolean option = false;
		StudentEnrollment student = new StudentEnrollment("", "");
		assertThrows(IllegalArgumentException.class, () -> {			
			student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		});
		assertEquals(0, student.getPassedCredits());
	}

	@Test
	void test0() {
		int enrollmentCredits = 10;
		int tuitionBalance = 4239;
		int passedCredits = 121;
		int semesterCredits = 20;
		int payment = 24600;
		int initialBalance = 4240;
		boolean lateRegistration = true;
		boolean debit = false;
		boolean option = false;
		StudentEnrollment student = new StudentEnrollment("", "");
		assertThrows(IllegalArgumentException.class, () -> {			
			student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		});
		assertEquals(0, student.getPassedCredits());
	}
	
	@Test
	void test1() {
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
	void test2() {
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
	
	@Test
	void test3() {
		int enrollmentCredits = 14;
		int tuitionBalance = -2147476070;
		int passedCredits = 74;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tuitionBalance);
		assertDoesNotThrow(() -> {
			student.setPassedCredits(passedCredits);			
		});
		assertEquals(passedCredits, student.getPassedCredits());
	}
}
