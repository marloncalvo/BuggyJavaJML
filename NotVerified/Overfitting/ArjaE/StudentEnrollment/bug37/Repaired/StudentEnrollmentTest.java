
import static org.junit.Assert.*;
import org.junit.Test;
public class StudentEnrollmentTest {
	@Test
	void test() {
		int enrollmentCredits = 14;
		int tuitionBalance = 4240;
		int payment = -2147483600;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tuitionBalance);
		assertThrows(IllegalArgumentException.class, () -> {			
			student.pay(payment, false);
		});
	}

	@Test
	void test0() {
		int enrollmentCredits = 0;
		int tuitionBalance = 4240;
		int payment = -1;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tuitionBalance);
		assertThrows(IllegalArgumentException.class, () -> {			
			student.pay(payment, false);
		});
	}
	
	@Test
	void test1() {
		int enrollmentCredits = 10;
		int tuitionBalance = -2103782046;
		int payment = -2146720700;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tuitionBalance);
		assertThrows(IllegalArgumentException.class, () -> {			
			student.pay(payment, false);
		});
	}
	
}
