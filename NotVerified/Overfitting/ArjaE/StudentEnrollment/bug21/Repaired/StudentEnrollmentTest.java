
import static org.junit.Assert.*;
import org.junit.Test;
public class StudentEnrollmentTest {
	@Test
	void test() {
		int enrollmentCredits = 13;
		int tuitionBalance = 456;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tuitionBalance);
		assertThrows(IllegalArgumentException.class, () -> {
			student.regularEnrollment();			
		});
	}

	@Test
	void test0() {
		int enrollmentCredits = 1;
		int tuitionBalance = 4240;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tuitionBalance);
		assertThrows(IllegalArgumentException.class, () -> {
			student.regularEnrollment();			
		});
	}
	
	// OpenJML false negative, cannot see passedCredits to invalid
	@Test
	void test1() {
		int enrollmentCredits = 12;
		int tuitionBalance = -1;
		int passedCredits = -2147476583;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tuitionBalance);
		student.setPassedCredits(passedCredits);
		assertDoesNotThrow(() -> {
			student.regularEnrollment();
		});
		assertEquals(tuitionBalance + enrollmentCredits * StudentEnrollment.costPerCredit, student.getTuition());
	}
	
	@Test
	void test2() {
		int enrollmentCredits = 12;
		int tuitionBalance = 1840;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tuitionBalance);
		assertThrows(IllegalArgumentException.class, () -> {
			student.regularEnrollment();			
		});
	}
}
