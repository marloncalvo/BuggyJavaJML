
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
        se.setEnrollmentCredits(14);
        se.setTuitionBalance(4240);

        assertThrows(IllegalArgumentException.class, () -> {
        	se.pay(-2147483600, false);
        });
    }

	@Test
    void case2() {
        se.setEnrollmentCredits(2);
        se.setTuitionBalance(-2147483201);

        assertThrows(IllegalArgumentException.class, () -> {
        	se.pay(-2147483600, false);
        });
    }
	
}
