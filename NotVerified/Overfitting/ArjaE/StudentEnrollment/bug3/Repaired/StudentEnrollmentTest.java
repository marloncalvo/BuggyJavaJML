
import static org.junit.Assert.*;
import org.junit.Test;
public class StudentEnrollmentTest {
	@Test
	void test() {
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
	void test0() {
		int enrollmentCredits = 6;
		int tuitionBalance = -2147482325;
		int passedCredits = 121;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tuitionBalance);
		assertThrows(IllegalArgumentException.class, () -> {
			student.setPassedCredits(passedCredits);			
		});
	}
	
	@Test
	void test1() {
		int enrollmentCredits = 18;
		int tuitionBalance = 1;
		int passedCredits = 0;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tuitionBalance);
		
			student.setPassedCredits(passedCredits);			
				assertEquals(passedCredits, student.getPassedCredits());
	}

}
