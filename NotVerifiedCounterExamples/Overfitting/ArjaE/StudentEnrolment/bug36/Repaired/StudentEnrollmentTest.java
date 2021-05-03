package ArjaE.StudentEnrolment.bug36.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentEnrollmentTest {

	@Test
	void test() {
		fail("False negative, code is correct because - (payment - penalty) => -payment + penalty. "
				+ "Which means tuitionBalance += penalty is ok. But can overflow.");
	}

}
