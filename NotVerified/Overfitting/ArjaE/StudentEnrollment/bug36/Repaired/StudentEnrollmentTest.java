
import static org.junit.Assert.*;
import org.junit.Test;
public class StudentEnrollmentTest {
	@Test
	void test() {
		fail("False negative, code is correct because - (payment - penalty) => -payment + penalty. "
				+ "Which means tuitionBalance += penalty is ok. But can overflow.");
	}

}
