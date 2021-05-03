
import static org.junit.Assert.*;
import org.junit.Test;
public class StudentEnrollmentTest {
	@Test
	void test() {
		int enrollmentCredits = 20;
		int tutionBalance = -2147474793;
		int _enrollmentCredits = 21;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tutionBalance);
		assertThrows(IllegalArgumentException.class, () -> {
			student.setEnrollmentCredits(_enrollmentCredits);
		});
	}

	@Test
	void test0() {
		int enrollmentCredits = 20;
		int tutionBalance = -2147475192;
		int _enrollmentCredits = 21;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tutionBalance);
		assertThrows(IllegalArgumentException.class, () -> {
			student.setEnrollmentCredits(_enrollmentCredits);
		});
	}
	
	// OpenJML false negative, somewhat. Input for passedCredits is invalid
	@Test
	void test1() {
		int enrollmentCredits = 20;
		int tutionBalance = -2147481437;
		int passedCredits = 121;
		int _enrollmentCredits = 6;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tutionBalance);
		student.setPassedCredits(passedCredits);
		assertDoesNotThrow(() -> {
			student.setEnrollmentCredits(_enrollmentCredits);
		});
		assertEquals(_enrollmentCredits, student.getEnrollmentCredits());
	}
}
