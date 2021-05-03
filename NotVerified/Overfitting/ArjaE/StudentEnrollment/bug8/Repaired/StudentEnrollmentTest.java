
import static org.junit.Assert.*;
import org.junit.Test;
public class StudentEnrollmentTest {
	@Test
	void test() {
		int enrollmentCredits = 21;
		StudentEnrollment enrollment = new StudentEnrollment("", "");
		assertThrows(IllegalArgumentException.class, () -> {
			enrollment.setEnrollmentCredits(enrollmentCredits);
		});
	}

	@Test
	void test0() {
		int enrollmentCredits = 21;
		StudentEnrollment enrollment = new StudentEnrollment("", "");
		assertThrows(IllegalArgumentException.class, () -> {
			enrollment.setEnrollmentCredits(enrollmentCredits);
		});
	}
	
}
