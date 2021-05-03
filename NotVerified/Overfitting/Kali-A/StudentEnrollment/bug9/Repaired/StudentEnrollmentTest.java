
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
public class StudentEnrollmentTest {
	StudentEnrollment se;
	
	@BeforeEach
	void setUp() throws Exception {
		se = new StudentEnrollment("", "");
	}

	@Test
    void case1() {
        se.setEnrollmentCredits(20);
        se.setTuitionBalance(-2147474793);

        assertThrows(IllegalArgumentException.class, () -> {
        	se.setEnrollmentCredits(21);
        });
    }
	
}
