
import static org.junit.Assert.*;
import org.junit.Test;
public class StudentEnrollmentTest {
	@Test
	void test() {
		int enrollmentCredits = 0;
		int tuitionBalance = 1;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tuitionBalance);
		assertThrows(IllegalArgumentException.class, () -> {
			student.lateEnrollment();
		});
	}
	
	@Test
	void test0() {
		int enrollmentCredits = 0;
		int tuitionBalance = 1;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tuitionBalance);
		assertThrows(IllegalArgumentException.class, () -> {
			student.lateEnrollment();
		});
	}

	@Test
	void test1() {
		int enrollmentCredits = 1;
		int tuitionBalance = 4240;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tuitionBalance);
		assertThrows(IllegalArgumentException.class, () -> {
			student.lateEnrollment();
		});
	}
	
	// OpenJML false negative, passedCredits cannot be set to invalid bounds
	@Test
	void test2() {
		int enrollmentCredits = -2147482760;
		int tuitionBalance = 1;
		int passedCredits = -2147475879;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tuitionBalance);
		student.setPassedCredits(passedCredits);
		assertThrows(IllegalArgumentException.class, () -> {
			student.lateEnrollment();
		});
	}
	
}
