
import static org.junit.Assert.*;
import org.junit.Test;
public class StudentEnrollmentTest {
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
