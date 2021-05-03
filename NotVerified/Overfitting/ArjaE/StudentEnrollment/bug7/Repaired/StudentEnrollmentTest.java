
import static org.junit.Assert.*;
import org.junit.Test;
public class StudentEnrollmentTest {
	// Test cases uses out of bounds passedCredits #, chose one at random for all cases.
	
	@Test
	void test() {
		int enrollmentCredits = -1;
		int passedCredits = 100;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setPassedCredits(passedCredits);
		assertThrows(IllegalArgumentException.class, () -> {			
			student.setEnrollmentCredits(enrollmentCredits);
		});
		assertEquals(0, student.getEnrollmentCredits());
	}
	
	@Test
	void test0() {
		int enrollmentCredits = -1;
		int passedCredits = 80;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setPassedCredits(passedCredits);
		assertThrows(IllegalArgumentException.class, () -> {			
			student.setEnrollmentCredits(enrollmentCredits);
		});
		assertEquals(0, student.getEnrollmentCredits());
	}

}
